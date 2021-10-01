fun main() {


    var i = 0
    for (i in 20..100) {
        if (!(30..40).contains(i)) {    // .contains(Obj)  Kotlin handles objects only.
            println("out of range")
            continue
        }
        println(i)
    }

    // scope of in and outside if statement
    for (i in 100..200 step 10) {
        if (i !in 150..180) print("-") else print("<")
        println(i)
    }

    // different from java: if can be used as an expression
    // this replaces java ternary operator
    for (i in 1..10){
        val prefix: String = if(i !in 5..8) "-" else "?" // if must be accompanied by else
        println("$prefix $i")
    }

    // multiple if checks
    var j: Int
    for (j in 1..30) {
        val prefix2 = if ((j % 2) == 2) {
            "Even $j"
        }
        else if (j in 20..30) "final 10s"       // the order matters.
        else if (j !in 10..20) "Not in range"
        else "all good."

        println("$prefix2 $j")
    }

    // Homework
    // verbose daily routine
    val time: Int

    for (time in 0..26) {
        var time_of_the_day = if (time in 0 until 7) {"Zzz..."
        }
        else if (time in 7..21) "Android battle"
        else if (time == 22) "bakc home!"
        else if (time in 23..25) "Do extra homework"
        else "fall asleep."

        println("at $time:00 $time_of_the_day")
    }
    println("repeat")


    // more concise daily routine.
    time = 0
    for (time in 0..26) {
        var routine = if (time in 0 until 7) {"Zzz..."
        }
        else if (time in 7..21) "Android battle"
        else if (time == 22) "back home!"
        else if (time in 23..25) "Do extra homework"
        else "fall asleep.";

        if (time == 7) println("at $time:00 $routine")
        else if (time == 22) println("at $time:00 $routine")
        else if (time == 25) println("at $time:00 $routine")
        else if (time == 26) println("at $time:00 $routine")
    }
    println("repeat")
}

/*
// more concise daily routine.
at 7:00 Android battle
at 22:00 back home!
at 25:00 Do extra homework
at 26:00 fall asleep.
repeat
*/
