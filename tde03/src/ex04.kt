fun main() {
    val daniel = Person2("Daniel", 29, "Developer", "50198840076")
    val newDaniel = daniel.copy("Daniel Souza")
    println(newDaniel)

}

data class Person2(
    val name: String,
    val age: Int,
    val profession: String,
    val cpf: String
)