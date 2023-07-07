package tour

fun main() {
    val myInterfaceImplemented:MyInteface = MyInterfaceImplemented(prop = 1)
    println(myInterfaceImplemented.propertyWithImplementation)
    println(myInterfaceImplemented.foo())

    val customer = Customer(firstName = "david", lastName = "king")
    println(customer.name)
}

// Interface : contain declarations of abstract methods, as well as method implementations
// difference with abstract classes : cannot store state
// can have properties, but these need to be abstract or provide accessor(getter) implementations

/* property syntax
var <propertyName>[: <PropertyType>] [= <property_initializer>]
[<getter>]
[<setter>]
 */

interface MyInteface{
    val prop: Int // should be abstract (not initialized)
    // or provide accessor implementation
    val propertyWithImplementation: String
        get() = "implemented"

    fun bar()
    // can have method that is not abstract. You don't have to implement method that is already implemented
    fun foo() = println("foo1")
}

class MyInterfaceImplemented(override val prop: Int) : MyInteface{
    val notInInterface = 1
    override fun bar() = println("bar")
    override fun foo() = println("foo2")
}


// Interface
interface Named{
    val name:String
}

interface Person:Named{
    val firstName:String
    val lastName:String

    override val name:String get() = "$firstName $lastName"
}

data class Customer(
    // implementing name is not required because it is implemented in Interface
    override val firstName: String,
    override val lastName: String,
):Person


interface A {
    fun foo() { print("A") }
    fun bar() { print("aar") }
    fun kka() { print("car")}
}

interface B{
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

// Resolving Overriding conflict : You must implement all conflicted method
class D:A,B{
    override fun foo() {
        TODO("Not yet implemented")
    }

    override fun bar() {
        TODO("Not yet implemented")
    }

}

