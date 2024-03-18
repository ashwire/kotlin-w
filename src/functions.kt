fun main() {
    //Predefined/Inbuilt library functions
    println("Hello Kotlin")

    var x = Math.sqrt(196.0)
    println(x)

    var y = Math.round(56.89)
    println(y)

    var z = Math.min(45,23)
    println(z)

    var number = Math.max(89,93)
    println(number)
    name()
    sum()
    details("Joe",34)
    details("Faith",57)
}

//User defined functions
fun name (){
    println("Ashley")
}
fun sum(){
    var number1 = 45
    var number2 = 67
    println(number1+number2)

}
//Parameter and arguments
fun details(name:String,age:Int){
    println("$name is $age years old")
}