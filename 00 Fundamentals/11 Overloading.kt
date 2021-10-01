fun main(){

    var result = getMax(52.5, 355.0)
    println(result)
    println("result type: ${result::class.simpleName}")

    println(getMax(1.0, 20.0, 5.2))

    greet("Pinak", 4)
    greet(2, "Burak")
}

// Overloading  ==  @Override in java
// When overloading, it is important that every version is different from every other one.
fun getMax(a: Int, b:Int) = if (a > b) a else b
fun getMax(a: Double, b:Double) = if (a > b) a else b
fun getMax(a: Double, b:Double, c:Double) =
    when {
        (a > b && a > c) -> a
        (b > a && b > c) -> b
        else -> c
    }

// Homework
// How to create two different versions of a function with same name with same number and types of variables...!?
fun greet(name: String, reps: Int) {
    for (i in 1..reps) println("Merhaba, ${name}can")
}

// change the order of the parameters.
fun greet(reps: Int, message: String) {
    for (i in 0 until reps) println(message)
}
