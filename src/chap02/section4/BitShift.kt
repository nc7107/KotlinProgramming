package chap02.section4

fun main() {
    val num = 4 // 0100
    println(num.shl(2)) // 0001 0000
    println(num shl 2) // 0001 0000

    println(num.shr(2)) // 0001
    println(num shr 2) // 0001
    println(num ushr 2)


}