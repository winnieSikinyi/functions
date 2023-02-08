fun main() {
    greetings("winnie")
    var y=module(55,4)
    println(y)
    var x=addition(56,67,89,19)
    println(x)
    goodFact("I am divine")
}fun greetings( name:String){
    println("hello"+name)

}
fun module(num1:Int,num2:Int):Int{
    var mod= num1%num2
    return mod
}

fun addition (num1: Int,num2: Int,num3: Int,num4: Int): Int{
    var sum= (num1+num2+num3+num4)
    return sum

}fun goodFact(name:String) {
    println("Winnie"+ name)
}


