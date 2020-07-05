package chap02.section3

fun main() {
    val a: Int = 128
    val b = a
    println(a == b)
    println(a === b)

    val c: Int? = a
    println(c == a)
    println(c === a)

    val d: Int? = a
    println(c == d)
    println(c === d)


}