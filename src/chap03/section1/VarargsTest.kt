package chap03.section1

fun main(args: Array<String>) {
    normalVarargs("FJOE", "FJOSDF")
    normalVarargs("FMOSDF", "FOSNF", "FSF")
}

fun normalVarargs(vararg counts: String) {
    for (letter in counts) {
        println(letter)
    }
    println("\n")
}