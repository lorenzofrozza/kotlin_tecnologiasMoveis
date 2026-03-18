fun main() {
    val generator = CharGenerator('A', 'Z')
    val result = generator.randomChar()
    println(result)
}

class CharGenerator(
    var minValue : Char,
    var maxValue : Char
){
    fun randomChar(): Char{
        return (minValue..maxValue).random()
    }
}