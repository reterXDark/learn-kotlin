fun main() {
//    Understand Truth Tables in Kotlin
    val myAge = 20
    val yourAge = 20

    val myName = "Umar"
    val yourName = "Ali"
    /*AND*/
    if ((myName !== yourName) && (myAge !== yourAge)) {
        println("We're not peers")
    }
    /*OR*/
    if ((myName !== yourName) || (myAge !== yourAge)) {
        println("We're not peers")
    }
}