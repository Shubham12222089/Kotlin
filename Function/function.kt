fun eo(n : Int){
    if(n%2==0){
        println("$n is Even")
    }else{
        println("$n is Odd")
    }
}
fun main(){
    print("Enter the number : ")
    var number = readLine()!!.toInt()
    eo(number)
}