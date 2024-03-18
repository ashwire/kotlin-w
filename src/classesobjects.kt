class Person{

    //Attributes/Properties
    var name = "James"
    var age = 34
    var loation = "Nairobi"

    //Behaviour/methods/Functions
    fun walk(){
        println("Person is walking")
    }
}

fun main() {
    var doctor = Person()
    println(doctor.age)
    println(doctor.name)

    doctor.walk()
}