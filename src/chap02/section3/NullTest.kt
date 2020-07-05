package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    var num1: Int? = 3
    println("str1 = $str1")
    println("num1 = $num1")

    str1 = null
    println("str1: $str1, length: ${str1?.length ?: -1}")
    
}