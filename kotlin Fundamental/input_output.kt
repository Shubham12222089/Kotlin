//Example : Print Variables and Literals
// fun main(args : Array<String>) {
//     val score = 12.3

//     println("score")
//     println("$score")
//     println("score = $score")
//     println("${score + score}")
//     println(12.3)
// }


// Taking input

//Example : Print String Entered By the User
// fun main(args: Array<String>) {
//     print("Enter text: ")

//     val stringInput = readLine()!!
//     println("You entered: $stringInput")
// }

// 2nd method

import java.util.Scanner

fun main(args: Array<String>) {

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")
}