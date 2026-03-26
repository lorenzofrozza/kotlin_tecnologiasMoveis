fun main() {
    val generator = CharGenerator('A', 'Z')
    println(generator.randomChar())
}

class CharGenerator(
    var minValue : Char,
    var maxValue : Char
){
    fun randomChar(): Char{
        return (minValue..maxValue).random()
    }
}