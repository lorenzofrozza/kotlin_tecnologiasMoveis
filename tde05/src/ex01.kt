fun average(vararg numbers: Double): Double {
    return numbers.average()
}

fun main() {
    val result = average(555.0, 5.0, 33.0)
    println(result)
}