fun main() {
    var list = mutableListOf<Int>( 2, 32, 3221, 123, 12, 312, 77)

    println("Largest: ${list.maxOrNull()} | Smallest: ${list.minOrNull()}")
}