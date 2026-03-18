fun main(){

    var even = 0

    for (i in 0..9 ) {
        print("Type a number: ")
        val input = readln()
        val number = input.toInt()
        if (number.rem(2) == 0) {
            even+=number
        }
    }
    println("Even numbers: $even")
}