// fun main(args: Array<String>) {

//     val a = 12
//     val b = 5

//     println("Enter operator either +, -, * or /")
//     val operator = readLine()

//     val result = when (operator) {
//         "+" -> a + b
//         "-" -> a - b
//         "*" -> a * b
//         "/" -> a / b
//         else -> "$operator operator is invalid operator."
//     }

//     println("result = $result")
// }

//example
fun main(args: Array<String>) {

    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator is invalid")
    }
}