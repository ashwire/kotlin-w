class Employee (var firstname:String, var salary:Double, var position:String){

    fun role(task:String){
        println("The role is $task")
    }
}

fun main() {
    var employee1 = Employee("John",120000.00,"Managing Director")
    var employee2 = Employee("Mary",150000.00,"HR")
    var employee3 = Employee("Mark",560000.00,"CEO")

    println(employee2.salary)
    println("Emloyee3 is the ${employee3.position}")

    employee3.role("CEO")
}