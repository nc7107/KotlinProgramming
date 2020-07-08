package chap03.section2

const val global = 10

fun main() {
    val num1 = 10
    val num2 = 3
    val result = noPureFunction(num1, num2)
    println(result)
}

fun noPureFunction(a: Int, b: Int): Int {
    return a + b + global
} // global 값에 따라 달라지므로 순수함수가 아니다.