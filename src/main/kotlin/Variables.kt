import kotlin.time.Duration.Companion.milliseconds

fun main(){
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
    val lastName = "NASIR"
    println(lastName::class);
}