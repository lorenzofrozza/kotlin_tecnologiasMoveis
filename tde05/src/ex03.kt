fun main() {
    val numbersWithDuplicates = listOf(1, 2, 2, 3, 4, 4, 5, 1, 6)

    val uniqueNumbers = processList(numbersWithDuplicates) { list ->
        list.toSet().toList()
    }

    println("Original list: $numbersWithDuplicates")
    println("List without duplicates: $uniqueNumbers")
}

fun processList(list: List<Int>, operation: (List<Int>) -> List<Int>): List<Int> {
    return operation(list)
}