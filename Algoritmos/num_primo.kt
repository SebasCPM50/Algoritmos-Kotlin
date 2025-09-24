fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    val n = 9 //(ejemplo)
    if (esPrimo(n)) {
        println("$n es primo")
    } else {
        println("$n no es primo")
    }
}