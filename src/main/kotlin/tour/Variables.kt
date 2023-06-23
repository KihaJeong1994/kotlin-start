package tour
// val : read-only variables(recommended)
// var : mutable variables(only if necessary)
// Variables can be declared outside the main() function -> declared at top level(conflict with other file)

fun main(){
    val popcorn = 5
    val hotdog = 7
    var customers = 10
    customers = 8
    println(popcorn)
    println(hotdog)
    println(customers)
}