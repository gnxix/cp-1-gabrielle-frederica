package gabby.CP2

fun main() {
    println("Masukkan jumlah case:")
    val case = readLine()?.toInt() ?: 0
    var x = 1

    while (x <= case) {
        val ganjil = mutableListOf<Int>()
        println("Masukkan angka a..b untuk Case $x:")
        val a = readLine()?.toInt() ?: 0
        val b = readLine()?.toInt() ?: 0

        for (j in a..b) {
            if (j % 2 == 1) {
                ganjil.add(j)
            }
        }

        val hasil = ganjil.sum()
        println("Case $x = $hasil")

        x++
    }
}

