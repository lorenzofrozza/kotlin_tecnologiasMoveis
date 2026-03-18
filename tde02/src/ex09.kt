fun main() {
    print("Enter a number between 1 and 7: ")
    var input = readln()
    val number = input.toInt()

    when(number){
        1 -> print("Sunday")
        2 -> print("Monday")
        3 -> print("Tuesday")
        4 -> print("Wednesday")
        5 -> print("Thursday")
        6 -> print("Friday")
        7 -> print("Saturday")
    }
}