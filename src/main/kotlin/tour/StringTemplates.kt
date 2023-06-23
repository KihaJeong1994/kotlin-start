package tour

// Template expressions always start with $
fun main(){
    val customers = 10 // Kotlin has inferred the type itself
    println("There are $customers customers")
    println("There are ${customers+1} customers")

    val name = "Mary"
    val age = 20
    println("$name is $age years old")
}