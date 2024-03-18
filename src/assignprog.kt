import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter student's marks:")

    val marks = reader.nextInt()

    val result= when(marks){
        in 90..100 ->"A"
        in 80..89 ->"B"
        in 70..79 ->"C"
        in 60..69 ->"D"
        in 50..59 ->"E"
        else -> "invalid"
    }

    println("The grade is $result")




}