fun main() {

    // Loop through an array of strings
    var names: Array<String> = arrayOf("Woods", "Coding", "Forest", "Nature", "Plain", "Plateau")
    // val numbers: Array<Int> = arrayOf(1, "I can't mix types.")
    var numbers: Array<Array<Int>> = arrayOf(arrayOf(1, 2, 4),    // Nested array
                                             arrayOf(5, 7, 9),
                                             arrayOf(10, 32, 52)) // 2D array
    for (name in names) println(name)


    // Loop through chars of a string
    var phrase = "Repetition can be boring or tedious, which is why so few people ever master anything."
    for (char in phrase) println(char)


    // For loop syntax - ascending
    for (i in 1..100) print("${i.toString() + " "}")        // start..end (inclusive)
    println()
    for (i in 1 until 50) print("${i.toString() + " "}")    // start until end (exclusive)

    for (i in 1 until 10) println(i)

    // For loop syntax - descending
    for (i in 20 downTo 5) println(i * -2)

    for (i in 1..100 step 4) print(i.toString() + " ")                      // add step
    println()
    for (i in 1.rangeTo(100).step(4)) print(i.toString() + " ")   // .rangeTo(),  .step()

    for (i in 100L downTo 10) println(i)
    for (i in 'a'..'z' step 2) println(i)


    // Homework
    println(names.indices)          // 0..5
    for (name in names) println("index: ${names.indexOf(name)}   element: ${name}")
    
    // Answer
    //for (index in names.indices)
    for (index in names.indices) println("index: $index   element: ${names[index]}")


}

/* Homework result (Answer result identical)
index: 0   element: Woods
index: 1   element: Coding
index: 2   element: Forest
index: 3   element: Nature
index: 4   element: Plain
index: 5   element: Plateau
*/
