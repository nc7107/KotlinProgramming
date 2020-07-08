package chap03.section1

fun main() {
    val name = "jehyuk"
    val email = "wpgurwpgur@naver.com"

    add(name)
    add(name, email)
    add("둘리", "wpgurwpgur@naver.com")
    defaultArgs()
    defaultArgs(200)
}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)
}