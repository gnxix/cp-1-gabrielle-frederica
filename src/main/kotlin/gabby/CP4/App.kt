package gabby.CP4

fun main() {
    val n = readLine()?.toIntOrNull()
    if (n == null || n > 1000000) {
        println("Anda harus memasukkan angka yang sesuai dalam range 1 - 1000000.")
        return
    }
    val reversed = n.toString().reversed().toInt()
    val isPrime = isPrime(n)
    val isEmirp = isPrime(reversed) && n != reversed
    when {
        isEmirp -> println("$n is emirp.")
        isPrime -> println("$n is prime.")
        else -> println("$n is not prime.")
    }
}

fun isPrime(n: Int): Boolean {
    if (n == 2 || n == 3) return true
    if (n == 1 || n % 2 == 0) return false
    var i = 3
    while (i * i <= n) {
        if (n % i == 0) return false
        i += 2
    }
    return true
}
