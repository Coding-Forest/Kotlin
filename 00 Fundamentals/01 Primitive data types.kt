// function syntax
fun main(args: Array<String>) {

    // Primitive Data Types
    val exampleString = "Coding Forest"
    val exNum1 = 2.8             // ctrl + shift+ P: shows data type 'Double'
    val exNum2 = 53              // Int
    val exNum3 = 4535483888883   // Long
    val exNum4 = 2.8E53          // Double
    val exNum5 = 43_000_000.2243 // Double


    // All data types are capitalised.
    // This is because we don't use primitive data types directly in Kotlin.
    // We always use objects. The compiler will convert them into primitive data types whenever possible.

    // Smaller number datatypes won't convert to bigger number types automatically. For example:
    // val exNum6: Long = exNum2           // This errors.
    val exNum7: Long = exNum2.toLong()  // Solution.

    // From bigger to smaller number
    val exNum8: Int = exNum5.toInt()    // You lose decimal points: 43000000
    println(exNum8)


    // Char & String
    val exChar1 = 'a'                   // '' (Single Quote) for Char
    val exStr = ""                      // "" (Double Quote) for String (is NOT a primitive type)

    val exChar2: Int = exChar1.toInt()  // 97
    println(exChar2)

    val escapeFreeString: String = """ 
        trim indent() is automatically added whenever you open \"\"\" (triple quote).
    """.trimIndent()
    println(escapeFreeString)


    // Boolean
    val exBool = false   // Used to control the flow of the programme.


    // Declaration first.
    val exVar: Int
    exVar = 453

}
