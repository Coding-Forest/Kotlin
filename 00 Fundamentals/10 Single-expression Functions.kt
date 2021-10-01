fun main(){
    getMax(12, 2)
    println("double: ${double(53.52)}")
    println("triple: ${triple(45.3)}")
    println("quadruple: ${quadruple(2253.0)}")

    var quad_answer = quadruple(553.0)
    println("$quad_answer type: ${quad_answer::class.simpleName}")   // get data type

    print("singleLine_getMax: ${singleLine_getMax(2, 45)}")
}

// function return syntax
fun getMax(num1: Int, num2: Int): Int {
    val max: Int = if (num1 > num2) num1 else num2
    println(max)  // Ctrl + Shit + P = Unit.  Unit is a kind of 'type', which is not meaningful. Similar to 'void' in java.
    return max
}

fun singleLine_getMax(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

fun double(num: Double): Double{
    return num * 2
}

// syntax for single-expression functions
// In single-expression functions, we don't need the 'return' keyword.
// However, in block bodies, we must declare 'return', we might be returning units implicitly otherwise.
fun triple(num: Double): Double = num * 3
fun quadruple(num: Double) = num * 4
