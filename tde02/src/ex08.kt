fun main() {
    print("Enter a number: ")
    var input = readln()
    val number = input.toInt()

    for (i in 1..10) {
        var result = number *i;
        println("$number X $i = $result")
    }
}