package tour

fun main() {

    // Null Safety
    // detects potential problem with null values at compile time
    // null safety features
    /*
    * explicitly declare when null values are allowed
    * check for null values
    * use safe calls to properties or functions that may contain null values
    * declare actions to take if null values are detected
    * */

    // Nullable Types : explicitly add ? after type declaration
    // by default, a type is not allowed to accept null values
    var neverNull : String = "This can't be null"
    println(neverNull)
//    neverNull = null // compile error

    // String != String? => Type mismatch!
    var nullable:String?
    nullable = null
    println(nullable)

    // Check for null values
    var nullString: String? = null
    println(describeString(nullString))

    // Use safe calls
    // ?.(safe call operator) : returns null if the object's property is null, else property
    // invocation is skipped and return null if null, else invoke
    // ?. can be chained ex) person.company?.address?.country
    println(lengthString(nullString))
    println(nullString?.uppercase())

    // Use Elvis operator
    // ?: (Elvis operator) : provide default value if null
    // the type left and right should be same, else return type is Any
    println(nullString?.length ?: 0)

    // Practice
    println((1..5).sumOf { id -> salaryById(id) })

}

fun describeString(maybeString: String?): String {
    // if you check null in conditional expressions -> you can use it as non-null
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun lengthString(string:String?):Int? = string?.length

data class Employee2 (val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> Employee2("Mary", 20)
    2 -> null
    3 -> Employee2("John", 21)
    4 -> Employee2("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0