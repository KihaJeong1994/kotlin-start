package tour

fun main() {
    // Conditional expressions : if, when(recommended)
    // if
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // no ternary operator (condition) ? a : b
    // but x = if(condition) a else b is possible
    val a = 1
    val b = 2
    println(if(a>b) a else b)

    // when
    // use when you have a conditional expression with multiple branches
    // all branches are checked until one of them is satisfied. Only the first suitable branch is executed
    val obj = "Hello"

    // statement
    when(obj){
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    // expression
    // when using expression, else is mandatory
    val result = when(obj){
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println("result is $result")

    val temp = 18
    val description = when {
        temp < 0 -> "very cold"
        temp < 10 -> "a bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }
    println(description)

    // --------------------------------------------------------------
    println("--------------------------------------------------------------")
    // Ranges
    val oneToFour = 1..4
    oneToFour.forEach { i-> print("$i ") }
    println()

    val fourToOne = 4 downTo 1
    fourToOne.forEach { i-> print("$i ") }
    println()

    val oneUntilFour = 1 until 4
    oneUntilFour.forEach { i-> print("$i ") }
    println()

    val oneToFiveStepTwo = 1..5 step 2
    oneToFiveStepTwo.forEach { i-> print("$i ") }
    println()


    val aToD = 'a'..'d'
    aToD.forEach { i-> print("$i ") }
    println()


    // --------------------------------------------------------------
    println("--------------------------------------------------------------")
    // Loops
    for (number in 1..5) print(number)
    println()
    val cakes = listOf("carrot", "cheese", "chocolate")
    for(cake in cakes) println(cake)

    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)



    // --------------------------------------------------------------
    println("--------------------------------------------------------------")
    // Practice
    val button = "A"

    println(
       when(button){
           "A"->"Yes"
           "B"->"No"
           "Y"->"Nothing"
           "X"->"Menu"
           else -> "There is no such button"
       }
    )

    var pizzaSlices = 0
    // Start refactoring here
    while (pizzaSlices<8){
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    pizzaSlices = 0
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }while (pizzaSlices<8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    for(num in 1..100){
        println(
            when{
                num%3==0 && num%5 ==0 -> "fizzbuzz"
                num%3==0  -> "fizz"
                num%5==0 -> "buzz"
                else -> num.toString()
            }
        )
    }

    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for(word in words){
        if(word.startsWith("l")) println(word)
    }


}