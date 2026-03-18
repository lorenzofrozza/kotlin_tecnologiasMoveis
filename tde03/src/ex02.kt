fun main() {
    val lorenzo = Person("Lorenzo", 21)
    lorenzo.walk()
    lorenzo.speak()
}

class Person(
    val name: String,
    val age: Int
){
    fun walk(){
        println("$name is walking")
    }

    fun speak(){
        println("$name is speaking and is $age years old")
    }

}