// fun main(){
//     val age = true
//     var driving = false
//     var result = age && driving
//     var r = age || driving
//     println(result)
//     println(r)
//     var a = 5
//     var b = 5
//     println(a==b)
// }

//Example: Comparison and Equality Operators
fun main(args: Array<String>) {

    val a = -12
    val b = 12

    // use of greater than operator
    val max = if (a > b) {
        println("a is larger than b.")
        a
    } else {
        println("b is larger than a.")
        b
    }

    println("max = $max")
}