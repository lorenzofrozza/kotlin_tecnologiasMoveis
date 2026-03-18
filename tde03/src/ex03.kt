fun main() {
    val status : Result = Result.Error("Error")
    when (status) {
        is Result.Loading -> println("Loading...")
        is Result.Success -> println("200")
        is Result.Error -> println("502")
    }
}


sealed class Result() {
    data object Loading : Result()
    data class Success(val success: String) : Result()
    data class Error(val error: String) : Result()
}

