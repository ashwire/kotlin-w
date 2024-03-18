fun main() {
    //While loop
    var number = 6
    while (number <= 10){
        println("Number is $number")
        number++
    }
    var x = 25
    while (x >= 20){
        println("$x")
        x --
    }
    //Do...while loop
    var counter = 100
    do {
        println("Number is $counter")
        counter++
    }while (counter<=106)

    //for loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (y in furniture){
        println(y)
    }
    var marks = arrayOf(90,56,73)
    for (m in marks){
        println(m)
    }

    //Range
    for (letter in 'a'..'d'){
        println(letter)
    }
    for (n in 5..10){
        println("count is $n")
    }


}