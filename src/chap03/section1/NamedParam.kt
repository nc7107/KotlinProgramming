package chap03.section1

fun main(args: Array<String>) {
    namedParam(x = 200, z = 100)
    namedParam(z = 100)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}