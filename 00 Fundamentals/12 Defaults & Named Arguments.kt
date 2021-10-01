fun main() {
    greet_in_Turkish("Selim", 4)
    // practice_speaking("Günaydın")    // Type mismatch: inferred type is String but Int was expected
    practice_speaking(word="Günaydın")  // Solution: specify the parameter name.

    println(getSum(1, 4, 6, 2))
    println(getSum(1, 4, 6))
    println(getSum(1, 4, d = 6))
}

fun greet(name: String, reps: Int = 2) {
    for (i in 1..reps) println("Hello, $name")
}

// Overload by calling the root function.
// This approach is more maintainable as the project gets bigger.
fun greet(name: String) {
    greet(name)
}

// To set default parameter, we always have to specify the type.
// This won't work, for example:
// fun greet_in_Turkish (name: String, num = 2) {
fun greet_in_Turkish (name: String, num: Int = 2) {
    for (i in 1..num) println("Selam $name, iyi günler!")
}

// Default parameters always come after non-default parameters. Same as in Python.
fun practice_speaking (num: Int = 2, word: String) {
    for (i in 1..num) println(word)
}

// Homework
fun getSum(a: Int = 1, b:Int = 2, c:Int = 3, d:Int = 4): Int {
    return a + b + c + d
}
