fun main() {
    fun portugueseColors(color: String): String {
        return when (color.lowercase()) {
            "blue" -> "Azul"
            "red" -> "Vermelho"
            "green" -> "Verde"
            "yellow" -> "Amarelo"
            else -> "Invalid Color"
        }
    }
    print("Type a color: ")
    var color = readln()
    println(portugueseColors(color))
}