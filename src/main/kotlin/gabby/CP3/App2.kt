package gabby.CP3

fun main() {
    // Input matriks
    val matrix = Array(3) { IntArray(3) }
    println("Masukkan nilai matriks:")
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            matrix[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    // Cek apakah matriks simetris atau tidak
    var isSymmetric = true
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (matrix[i][j] != matrix[j][i]) {
                isSymmetric = false
                break
            }
        }
    }

    // Tampilkan hasil
    if (isSymmetric) {
        println("Matriks tersebut simetris")
    } else {
        println("Matriks tersebut tidak simetris")
    }
}
