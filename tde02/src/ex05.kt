fun main() {
    print("Enter your age: ")
    var input = readln()
    var age = input.toInt()

    when {
        age in 1.. 12 -> println("Kid")
        age >=12 && age<=17 -> println("Teenager")
        age in 18 .. 59 -> println("Adult")
        age >= 60 -> println("Elder")
        else -> println("Invalid age ")
    }
}