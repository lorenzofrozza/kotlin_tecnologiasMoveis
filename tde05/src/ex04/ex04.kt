package ex04

fun main() {


    val list = calculate(9, 120, 33, 3, 7, 31, 7) {
        it % 2 != 0
    }
    println(list.lastOrNull() ?: "Nenhum número ímpar encontrado")
}

fun calculate(
    vararg numeros: Int,
    op: (Int) -> Boolean
): List<Int> {

    return numeros.filter {
        op(it)
    }
}

