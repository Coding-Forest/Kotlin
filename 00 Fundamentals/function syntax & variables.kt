// function syntax
fun main(args: Array<String>) {
    val userName = "Coding Forest"  // variable types. val for immutable variable
    var kotlin_level = 1               // var for mutable variable

    Int                        // ctrl + B to view source code
    saySomethingKotlin()       // ctrl + alt + L to adjust line spacing
    println("Hi, my name is $userName. I just started Kotlin. In 3 months, my Kotlin level will be ${kotlin_level * 53.2}.")
    // println("Hello, my name is" + userName) java
}

fun saySomethingKotlin() {
    println("Hello... I'm Kotlin. Nice to meet you :) !!")
}

/*
"C:\Program Files\Java\jdk-16.0.1\bin\java.exe"
Hello... I'm Kotlin. Nice to meet you :) !!
Hi, my name is Coding Forest. I just started Kotlin. In 3 months, my Kotlin level will be 53.2.

Process finished with exit code 0
*/
