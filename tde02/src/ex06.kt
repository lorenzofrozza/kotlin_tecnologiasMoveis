fun main() {
    print("Enter any word to count its vowels: ")
    var input = readln().lowercase()
    var vowels = 0

    for (char in input) {
        if (char in "aeiou") {
            vowels++
        }
    }
    println("Number of vowels: $vowels")
}