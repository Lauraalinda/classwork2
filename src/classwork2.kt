fun main () {
    printName("laura")
    var y=modulus(13 ,2)
    var m=sum(2, 3 ,4, 5)
    println(m)
    printfunfact("I love swimming")


}
fun printName(name:String){
    println("Hello $name")
}

fun modulus(num1: Int , num2:Int):Int{
    var x = num1%num2
    return x
}
fun sum(a:Int ,b:Int ,c:Int ,d:Int):Int{
    var sum=a+b+c+d
    return sum
}

fun printfunfact(fact:String){
    print(fact)
}