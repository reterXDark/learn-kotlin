fun main(args: Array<String>) {
    val a = 10;
    val b = 12;

    /* simple Function*/
    fun findGreater2( a:Int, b:Int):Int {
        return if (a > b) {
            a
        }else {
            b
        }
    }
    /* Function Expression*/
    fun findGreater( a:Int, b:Int):Int = if (a>b) a else b

    println(findGreater(a,b))
}