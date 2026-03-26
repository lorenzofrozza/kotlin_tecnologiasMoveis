fun main() {
    println(calculate(10, 20, 30, 3) {
        it % 2 == 0
    })

    calculate(9, 120, 33, 3) {
        it % 2 != 0
    }
}

fun calculate(
    vararg numeros: Int,
    op: (Int) -> Boolean
): List<Int> {

       return numeros.filter {
            op(it)
        }
}

