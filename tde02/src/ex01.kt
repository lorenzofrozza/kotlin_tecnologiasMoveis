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

        list.add(number)
    }

    if (list.isEmpty()) {
        println("No numbers were entered.")
    } else {
        println("The average is ${list.average()}")
    }


}