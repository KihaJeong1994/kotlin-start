package tour
// Basic Types
// Kotlin infers the data type(type inference)

// Basic types category
// Integers : Byte, Short, Int, Long
// Unsigned Integers : UByte, UShort, UInt, ULong
// Floating-point numbers : Float, Double
// Booleans : Boolean
// Characters : Char
// Strings : String

fun main() {
    // you can declare variables and initialize them later, but you need type declaration
    // specify type with :
    val num:Int
//    println(d) // you cannot read variable before it is initialized
    num = 3

    // you can declare type explicitly
    val word:String = "hello"

    println(num)
    println(word)

    val a:Int = 1000
    val b:String = "log message"
    val c:Double = 3.14
    val d:Long = 100_000_000_000_000
    val e:Boolean = false
    val f:Char = '\n'
}