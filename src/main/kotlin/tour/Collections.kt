package tour

// Collections
// List, Set, Maps

fun main() {
    // List : ordered
    // listOf() : create a read-only list List
    // mutableListOf() : create a mutable list MutableList

    // read-only List
    val readOnlyShapes = listOf("triangle","square","circle")

    // mutuable MutableList
    val shapes = mutableListOf("triangle", "square", "circle")

    // casting : obtain read-only views of mutable lists by assigning them to a List
    val shapesLocked:List<String> = shapes

    // [] : indexed access operator
    // first(), last(), count()
    // in operator : check that an item is in a list
    println("The 0 index item in the list is : ${readOnlyShapes[0]}")
    println("The first item in the list is : ${readOnlyShapes.first()}")
    println("The last item in the list is : ${readOnlyShapes.last()}")
    println("The number of item in the list is : ${readOnlyShapes.count()}")
    println("circle" in readOnlyShapes)
    println("star" in readOnlyShapes)

    // add(), remove()
    shapes.add("pentagon")
    println(shapes)
    shapes.remove("pentagon")
    println(shapes)
    // --------------------------------------------------------------
    println("--------------------------------------------------------------")
    // Set : unordered
    // setOf() : create a read-only set Set
    // mutableSetOf() : create a mutable set MutableSet

    // read-only set
    val readOnlyFruits = setOf("apple","banana","cherry","cherry")

    // mutable set
    val fruits = mutableSetOf("apple","banana","cherry","cherry")
    println(readOnlyFruits) // duplicated cherry is dropped

    // casting is also available
    val fruitLocked:Set<String> = fruits

    // count()
    // in operator
    println("The number of item in the set is : ${readOnlyFruits.count()}")
    println("cherry" in readOnlyFruits)
    println("watermelon" in readOnlyFruits)

    // add(), remove()
    fruits.add("dragonfruit")
    println(fruits)
    fruits.remove("dragonfruit")
    println(fruits)




    // --------------------------------------------------------------
    println("--------------------------------------------------------------")
    // Map
    // mapOf() : create read-only map Map
    // mutableMapOf() : create mutable map MutableMap
    // use 'to' between key and value

    // read-only map
    val readOnlyAccountBalances = mapOf(1 to 100, 2 to 200, 3 to 1000)

    // mutable map
    val accountBalances = mutableMapOf(1 to 100, 2 to 200, 3 to 1000)

    // casting is also available
    val accountBalancesLocked:Map<Int,Int> = accountBalances

    // [] : indexed access operator
    println("The value of key 1 is ${readOnlyAccountBalances[1]}")
    println("This map has ${readOnlyAccountBalances.count()} of key-value pairs")

    // put(), remove()
    accountBalances.put(4,400)
    println(accountBalances)
    accountBalances.remove(4)
    println(accountBalances)

    // containsKey() : check if a specific key is already included
    println(accountBalances.containsKey(1))
    println(accountBalances.containsKey(5))

    // keys, values : obtain a collection of the keys or values
    println(readOnlyAccountBalances.keys) // set
    println(readOnlyAccountBalances.values) // collection

    // --------------------------------------------------------------
    println("--------------------------------------------------------------")
    // Practice
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("There are ${greenNumbers.count()+redNumbers.count()} in total")

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}

