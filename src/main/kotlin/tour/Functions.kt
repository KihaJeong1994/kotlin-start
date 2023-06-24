package tour

import kotlin.math.PI

fun main() {
    println(sum(1,2))
    println(multiply(3,4))

    // Named Arguments
    sendMessageToSomeone(message = "Bye", someone = "David")

    // when 1st argument is omitted, you should name all after that
    sendMessageToSomeone(someone = "Helen")

    // Practice
    println(circleArea(1))

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))

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

fun circleArea(radius:Int)= PI*radius*radius

fun intervalInSeconds(hours: Int=0, minutes: Int=0, seconds: Int=0) =
    ((hours * 60) + minutes) * 60 + seconds
