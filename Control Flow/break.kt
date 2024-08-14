// fun main(args: Array<String>) {

//     var sum = 0
//     var number: Int

//     while (true) {
//         print("Enter a number: ")
//         number = readLine()!!.toInt()

//         if (number == 0)
//             break

//         sum += number
//     }

//     print("sum = $sum")
// }


// Label in Kotlin starts with an identifier which is followed by @.
// Here, test@ is a label marked at the outer while loop. Now, by using break with a label 
//(break@test in this case), you can break the specific loop.

fun main(args: Array<String>) {

    first@ for (i in 1..4) {

        second@ for (j in 1..2) {
            println("i = $i; j = $j")

            if (i == 2)
                break@first
        }
    }
}