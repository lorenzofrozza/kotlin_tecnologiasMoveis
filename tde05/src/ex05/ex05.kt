package ex05

fun main () {
    val names = listOf("lorenzo", "kotlin", "android", "programacao")

    val upperCaseNames = changeString(names) {
        text -> text.uppercase()
    }
    println(upperCaseNames)
}

fun changeString(
    list: List<String>,
    operation: (String) -> String): List<String> {
    return list.map { operation(it) }
}