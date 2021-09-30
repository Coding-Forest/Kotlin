fun main(args: Array<String>) {
    var a = 50
    var b = 32
    val c = 12.0

    val result = a + b
    val devision_result = a / b
    println(result)
    // Binary operators - used for infix notations
    println("a + b = ${a + b}")          // 82
    println("a - b = ${a - b}")          // 18
    println("a * b = ${a * b}")          // 1600
    println("a / b = ${a / b}")          // 1 : because a and b are Int's, the decimal points got dropped.
    println("a % b = ${a % b}")          // 18

    println(devision_result.toFloat())   // 1.0 Float is not precise.
    println(a / c)                       // 4.166666666666667 Operation of Int and Double is more precise.
    //println("a ++ 453: ${a += 453}")     // Errors.

    // Unary operator - used for post/prefix notations
    println("a++: ${a++}")      // 50 return first, then increment.
    println("++a: ${++a}")      // 52 increment first, then return.

    println("b--: ${b--}")      // 50 return first, then increment.
    println("--b: ${--b}")      // 52 increment first, then return.

}
