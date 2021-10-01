fun main() {

    // In Kotlin, paramters are values, not variables becauase this is often the source of bugs.
    // In java you can change parameter values, but in Kotlin not.

    greet_formally("Kotlin")
    greet_informally("Java", 2)
    println()

    val invitees = arrayOf("Serra", "Selim", "Burak", "Asena", "Biricik", "Pinak", "Onur", "Ihsan")

    send_invite(invitees)

    printMax(2, 5)
    printMaxtimes(8, 7)
}

fun greet_formally(name: String) {
    println("Hallo. Ich bin $name. Erfreut, Sie kennen zu lernen")
}

fun greet_informally(name: String, situation: Int) {

    val greeting: String = when {
        situation == 1 -> "Schön dich kennenzulernen."
        situation == 2 -> "Schön dich mal wieder zu treffen."
        else -> "Auf Wiedersehen."
    }

    println("Hallo. Ich bin $name. $greeting")
}

fun send_invite(list: Array<String>) {

    for (i in 0 until list.size) {
        var message: String = ""
        var name = list.elementAt(i)
        var vocative = list.elementAt(i) + "can"

        if (name == "Asena") {
            message =  "Sorry, you are uninvited $name \n"
        }
        else if (name == "Ihsan") {
            vocative = name + " Bey"
        } else {
            message = "To: ${name} \nSubject: party invite\nMessage: Selam ${vocative}. Please come join us!\n"
        }
        println(message)
    }
}


// Homework
fun printMax(num1: Int, num2: Int) {
    var max = maxOf(num1, num2)
    for (i in 1..max) {
        println("Hello, nice to meet you.")
    }
}

// Answer
fun printMaxtimes(num1: Int, num2: Int) {
    val max = if (num1 > num2) num1 else num2
    for (i in 1..max) {
        println("Good job on your homework")
    }
}
