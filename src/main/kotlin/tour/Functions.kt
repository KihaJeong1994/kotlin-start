package tour

import kotlin.math.PI

fun main() {
    println(sum(1,2))
    println(multiply(3,4))

    // Named Arguments
    sendMessageToSomeone(message = "Bye", someone = "David")

    // when 1st argument is omitted, you should name all after that
    sendMessageToSomeone(someone = "Helen")

    // Lambda
    // {[parameterName:parameterType ->] functionBody}

    // 1. assign a lambda to a variable that you can then invoke later
    val upperCaseString = {string:String -> string.uppercase()}
    println(upperCaseString("hello2"))

    // 2. pass a lambda expression as a parameter to another function
    // if a lambda expression is the only function parameter, you can drop the ()
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    println(numbers.filter { x-> x>0 })
    println(numbers.filter { x-> x<0 })

    // 3. return a lambda expression from a function
    // Function types : ([parameterType...] -> returnType)
    val multiPlyByTwo:(Int)->Int = { num -> num * 2 }
    println(numbers.map(multiPlyByTwo))

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2Sec = toSeconds("minute")
    println("Total sum of minutes in sec is : ${timesInMinutes.map(min2Sec).sum()}")


    // 4. invoke a lambda expression on its own
    println({string:String -> string.uppercase()}("hello"))

    // Practice
    println(circleArea(1))

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))

    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val createUrl:(String, Int) -> String = { action, id -> "$prefix/$id/$action"}
    val urls =  actions.map { action -> createUrl(action, id) }
    println(urls)

    repeatN(5) { println("hello") }
}

// declare function
/*
* fun functionName([parameterName:parameterType, ... ]) :returnType{
*   return returnValue
* }
* */

fun sum(x:Int, y:Int):Int{
    return x+y
}

// Single expression : you can omit {} and use =. Also, due to Kotlin type inference, you can also omit return type
fun multiply(x:Int, y:Int) = x*y;

// use = operator to declare a default value after type
// no return = Unit type(same as void in java)
fun sendMessageToSomeone(message:String = "Hello", someone:String):Unit{
    println("$someone, $message")
}

fun toSeconds(time:String): (Int)->Int = when(time){
    "hour" -> {value -> value*60*60}
    "minute" -> {value -> value*60}
    else -> {value -> value}
}


fun circleArea(radius:Int)= PI*radius*radius

fun intervalInSeconds(hours: Int=0, minutes: Int=0, seconds: Int=0) =
    ((hours * 60) + minutes) * 60 + seconds

fun repeatN(n: Int, action: () -> Unit) {
    for(i in 1..n) {
        action() // action is not enough. To execute ()->Unit Function, you need to add (), like action()
    }
}
