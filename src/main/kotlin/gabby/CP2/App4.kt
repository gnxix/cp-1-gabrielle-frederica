package gabby.CP2

fun main(){
    println("Masukan angka: ")
    val n = readLine()?.toInt() ?: 0
    val m = readLine()?.toInt() ?: 0
    var angka = n
    var seq = mutableListOf<Int>()

    while (angka > 1) {
        seq.add(angka)
        if (angka % m == 0) {
            angka = angka / m
        } else {
            println("boring!")
            break
        }
    }
    if (angka == 1) {
        seq.add(angka)
        println(seq.joinToString(", "))
    }
}