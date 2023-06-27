package tour

import kotlin.random.Random

fun main() {

    // By default, Kotlin automatically creates a constructor with the parameters declared in class header
    val contact = Contact(1, "david@gmail.com")
    println(contact.email)
    contact.email = "changed@naver.com"
    println(contact.email)
    contact.printId()

    val user = User("Vincent", 2)
    val secondUser = User("Vincent", 2)
    println(user) // println() automatically call toString()
    println("user == secondUser : ${user == secondUser}")

    // Creates an exact copy of user
    println(user.copy())

    // Creates a copy of user with different properties
    println(user.copy("Max"))
    println(user.copy(id = 3))

    // Practice
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)

    println("------------------")

    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}

// Class
// class header :  properties within ()
// class body   :  properties within {}
// recommend to declare read-only properties as val
// you can declare properties without val or var, but theses properties are not accessible after an instnace has been created
class Contact(
    val id: Int,
    var email: String, // trailing comma is available
){
    val category:String = "work"
    fun printId() = println(id)

}

// Data classes
// useful for storing data
// provides function : toString(), equals() or ==, copy()
// any code that relies on the original instance isn't affected by the copy
data class User(val name:String, val id:Int)

// Practice
data class Employee(val name: String, var salary:Int)

class RandomEmployeeGenerator(var minSalary:Int, var maxSalary:Int){
    private val names:List<String> = listOf("Helen","Coffu","Alice","James")

    fun generateEmployee():Employee{
        val salary = Random.nextInt(from = minSalary, until = maxSalary)
        return Employee(names.random(),salary)
    }
}