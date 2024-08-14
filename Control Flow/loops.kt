// Program to print line 5 times

// fun main(args: Array<String>) {

//     var i = 1

//     while (i <= 5) {
//         println("Line $i")
//         ++i
//     }
// }


//-------------do while-----------------
// fun main(args: Array<String>) {

//     var sum: Int = 0
//     var input: String

//     do {
//         print("Enter an integer: ")
//         input = readLine()!!
//         sum += input.toInt()

//     } while (input != "0")

//     println("sum = $sum")
// }

//----------------for loop------------
// fun main(args: Array<String>) {

//     for (i in 1..5) {
//         println(i)
//     }
// }

//example

// fun main(args: Array<String>) {

//     print("for (i in 1..5) print(i) = ")
//     for (i in 1..5) print(i)

//     println()

//     print("for (i in 5..1) print(i) = ")
//     for (i in 5..1) print(i)             // prints nothing

//     println()

//     print("for (i in 5 downTo 1) print(i) = ")
//     for (i in 5 downTo 1) print(i)

//     println()

//     print("for (i in 1..5 step 2) print(i) = ")
//     for (i in 1..5 step 2) print(i)

//     println()

//     print("for (i in 5 downTo 1 step 2) print(i) = ")
//     for (i in 5 downTo 1 step 2) print(i)
// }


//---------Iterating Through an Array

// fun main(args: Array<String>) {

//     var language = arrayOf("Ruby", "Kotlin", "Python","Java")

//     for (item in language)
//         println(item)
// }

//----------Iterating Through a String
fun main(args: Array<String>) {

    var text= "Kotlin"

    for (letter in text) {
        println(letter)
    }
}