fun main() {
    var greeting = "Hello World"
    var firstname = "Glory"
    var lastname = "emobilis"

    println(firstname + " " + lastname) //String concatenation
    println(firstname.plus(lastname))

    println(greeting[6]) //Accessing an element in a string
    println(greeting.indexOf("World"))

    println(firstname.toUpperCase())

    //String interpolation
    println("Hello there. My name is $firstname ")

}