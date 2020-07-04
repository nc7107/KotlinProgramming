import com.example.edu.Person as User

fun main() {
    println("hello Kotlin!")

    val person = User("Jehyuk", 26)
    val person2 = Person(123, "Jehyuk", "Programmer")
    println(person)
    println(person.name)
    println(person.age)
}

class Person(val no: Int, val name: String, val jobTitle: String)

