    var names: Array<String> = arrayOf("Woods", "Coding", "Forest", "Nature", "Plain", "Plateau")
    // val numbers: Array<Int> = arrayOf(1, "I can't mix types.")
    var numbers: Array<Array<Int>> = arrayOf(arrayOf(1, 2, 4),    // Nested array
                                             arrayOf(5, 7, 9),
                                             arrayOf(10, 32, 52)) // 2D array

    println(names[2][4])
    println(numbers[2][2])

    names[1] = "Programing"
    // names[3] = "Nature"     // Errors.  Index 3 out of bounds for length 3

    println("First element: ${names[0]}")
    println("Second element: ${names[1]}")
    println("Third element: ${names[2]}")
    println("Last element: ${names[names.size - 1]}")
    println("Last element: ${names[names.lastIndex]}")  // gets the last element by index
    println("Last element: ${names.last()}")            // returns last element
    println("Last index: ${names.lastIndex}")
    println(names.size)

    // Array class always uses object types.
    arrayOf(1, 2, 3)    // Integer[]  This is an array of Integer objects, not primitive data.
    intArrayOf(1, 2, 3) // int[]
    var array = IntArray(9)
    print(array)        // [I@5fd0d5ae
