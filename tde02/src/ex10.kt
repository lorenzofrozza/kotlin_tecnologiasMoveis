fun main() {
    val list = mutableListOf<Int>()

    for (i in 0..4) {
        print("Type a number: ")
        val input = readln()

        if (input.isBlank()) {
            println("Empty value, skipping...")
            continue
        }

        val number = input.toIntOrNull()

        if (number == null) {
            println("Invalid number, skipping...")
            continue
        }

        if (number > 10) {
            list.add(number)
        }

    }

    if (list.isEmpty()) {
        println("Any number greater than 10 was entered")
    } else {
        println("The sum is ${list.sum()}")
    }


}