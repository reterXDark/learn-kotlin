import java.util.*
import kotlin.time.Duration.Companion.milliseconds

fun main() {
//    variables in kotlin
    var fullName = "Learn Kotlin"
    println(fullName)
    /*re-initializing the variable*/
    fullName = "Beast Kotlin"
    println(fullName)
    /*set to empty string*/
    fullName = "asd"
    println(fullName)

    /*Build in properties of a variables*/
    println(fullName.isEmpty())

//    Immutable or read-only variables in kotlin
    val age = 30
    println(age);

//    How to Provide a Type on Kotlin Variables
    val lastName: String = "NASIR"
    println(lastName::class);
//    Kotlin Data Types: Numbers
    val myByte: Byte = 8 //8-bit signed Integer
    val myShort: Short = 16 //16-bit signed Integer
    val myInt: Int = 32 //32-bit signed Integer
    val myLong: Long = 64 //64-bit signed integer
    /*for decimal value*/
    val myFloat: Float = 2.43F // 32 bit floating point number
    val myDouble: Double = 2323.232 //64 bit floating point number
    /*Every Thing in kotlin is an object like types of each variable are object which can extend each other*/
    println(myByte.toDouble())
    /*Using methods to do some simple calculations*/
    println("ADDED BY BUILT IN FUNCTION :" + myByte.plus(myShort))
    println("" + myByte.times(8))
//    Kotlin Data Types: String and Char
    val outfitter: String = "Outfitters" // String with double quotes
    println(outfitter.length)
    println(outfitter.replaceFirstChar { it.lowercase(Locale.getDefault()) })
    val outfitter2: Char = '\\' // String with single quotes & CHar represent 16 bit unicode character
    println(outfitter2)


//    Kotlin String Interpolation and Triple Quotes
    /*for multiple line message we can do like this*/
    var message: String =
        "Salam, \n My name is Umar \n im cs graduate \n im working as software engineer at \n \t Trailfive technology"
//    println(message)

    /*it's some seems ugly so in kotlin we can write string in multiple line*/
    val messageTwo: String = """
        Salam, 
            My name is Umar im cs graduate &
            im working as software engineer at Trail-five technology
    """.trimIndent()
    println(messageTwo)

    val name: String = "Umar"
    val agee: Int = 20

    println("Hello My Name is $name & my age is $age lastly your name is ${name.length} characters long")

//    Kotlin Data Types: Boolean
    var isBlank: Boolean = true
    println(isBlank.not())
    isBlank = "".isBlank()
    isBlank = "".isNotBlank()

    println(isBlank)

}
