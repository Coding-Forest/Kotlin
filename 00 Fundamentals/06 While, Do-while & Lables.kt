fun main() {
    var i = 0

    // use: reading files line by line for certain amount only.
    while (i < 5) {
        println(i)
        i++
    }

    // do while
    i = 4
    do {
        println(i)
        i++
    } while (i < 20)


    // nested do while loop
    i = 0
    do {
        println(i)
        i++

        var j = 0

        while (j < 7) {
            println("---$j")
            j++
            break                              // breaks out of the j while loop.
            println("scope j is not printed")
        }
        println("scope i is printed")
    } while (i < 5)                             // the code breaks out after j: 9



    // roll of continue
    // nested do while loop
    i = 0
    outer@ do {        // label@
        println(i)
        i++
        //continue    // skips the entire nested loop.
                      // always work on the next enclosing loop (which its itself with i++)
        var j = 0

        while (j < 7) {
            println("---$j")
            j++
            break@outer     // break is labelled, so the code will break out of even the outer loop.
            println("scope j is not printed")
        }
        println("scope i is printed")
    } while (i < 5)

    
    
    // Homework
    var number = 100

    do {
        number /= 2
        println(number)
    } while (!(number <= 1))

    
    // Answer
    var number1 = 100
    var counter = 0

    while (number1 > 1) {
        number1 /= 2
        counter++
    }

    print(counter)
}
