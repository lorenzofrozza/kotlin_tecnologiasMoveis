fun String.currencyBRL() : String {
    return "R$ $this"
}

fun main() {
    val price = "150.50"
    val formattedPrice = price.currencyBRL()

    println("Original price: $price")
    println("Price with R$: $formattedPrice")
}