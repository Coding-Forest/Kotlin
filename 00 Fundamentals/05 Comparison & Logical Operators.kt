fun main() {

    // Comparison operator returns boolean
    println("2 > 1 is ${2 > 1}")
    println("120 < 1 is ${120 < 1}")
    println("120 == 1 is ${120 == 1}")
    println("1 >= 1 is ${1 >= 1}")
    println("1 != 1 is ${1 != 1}")

    println("Logical NOT of !true is ${ !true }")
    println("Logical NOT of !false is ${ !false }")

    // This logic can be used to toggle boolean variables.
    var a = true
    println("a: $a")
    a = !a
    println("a: $a")

    println("true && false: ${ true && false }")    // logical AND: if the left-side variable is false, its always false.
    println("true || false: ${true || false}")      // logical OR: if the left-side is true, it's always true.

    /** Exclusive or (XOR)
     *  is a logical operator which results true
     *  when either of the operands are true (one is true and the other one is false)
     *  but both are not true and both are not false.
     *  so it filters only the exclusively or cases.
      */
    println(true xor true)      // false
    println(true xor false)     // true

    val condition1 = (2>1) || (3>2) && (2>3)     // && has precedence to ||.
    println(condition1)                          // true

    val condition2 = ((2>1) || (3>2)) && (2>3)
    print(condition2)                            // flase

}
