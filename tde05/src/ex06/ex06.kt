package ex06


fun String.customUpperCase() : String {
    return this.uppercase()
}

fun main() {
    val name: String = "Lorenzo"

    println(name.customUpperCase())
}