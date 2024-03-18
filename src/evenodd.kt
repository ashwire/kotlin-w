import java.util.Scanner

fun main() {
    var y = Scanner(System.`in`)

    print("Enter a number:")
    var number = y.nextInt()

    if (number %2 == 0){
        println("$number is even")
    }
    else{
        println("$number is odd")
    }
}