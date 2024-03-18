fun main() {
    //Break statement
    for (number in 34..39){
        if (number==37){
            break
        }
        println(number)
    }

    //Continue statement
    for (characters in 'd'..'h'){
        if (characters == 'f'){
            continue
        }
        println("characters is $characters")
    }
}