fun main() {
    print("Enter a number: ")
    var input = readln()
    var number =  input.toInt()

    when {
        number >0 -> println("Positive")
        number <0 -> println("Negative")
        else -> println("Zero")
    }

}