fun main() {

    var time: Int

    for (time in 0..24) {

        // similar to java switch.
        // but kotlin when is more flexible.
        // Can do more than equality checks.
        val greeting = when (time) {
            in 0..7 -> {
                "Zzz..."
            }
            in 7..11 -> {
                "Guten Morgen!"
            }
            in 12..17 -> {
                "Guten Tag!"
            }
            in 18..20 -> {
                "Guten Abend."
            }
            else -> "Gute Nacht"
        }

        println("at $time:00 ${if (time == 7 || time == 12 || time == 18 || time == 0) greeting else continue}")
    }

    time = 15

    // iterates through the conditions and breaks out when finds the match.
    // The remaining conditions in the queue will not be checked.
    // THE ORDER MATTERS.
    val isSaturday = true
    var greetings: Any

    if (isSaturday) {
        time = 13
    }

    // update greeting according to time
    greetings = when {
        time in 0..7 -> "Zzz......zzzzzz....."
        time in 7..9 -> "Wake up!"
        time == 13 -> "Fuel recharge time"
        time in 14..15 -> "Powered by lunch fuel"
        else -> println("Fighting Kotlin...")  // else is mandatory when it's needed.
    }

    println("$time $greetings")
    
    
    // Homework 
        val time = 13
    val isFriday = true

    if (isFriday) println("Last day of the week. You can do it keep pushing!")

    val greeting = when {
        time < 13 -> "Not fuel charge time yet."
        time == 13 || time == 14 -> "Recharge completed."
        time == 16 -> "Wanna go home?"
        time > 18 -> "Free me time! Hands on Android!"
        else -> "Zzzzzz..."
    }
    println("Time: $time   $greeting")

}
