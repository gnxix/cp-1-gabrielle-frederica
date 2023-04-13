package gabby.CP4

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val m = readLine()!!.toInt()
        val x1 = m.toString(2)
        val b1 = x1.count { it == '1' }
        val x2 = m.toString(16).toInt(16).toString(2)
        val b2 = x2.count { it == '1' }
        val result = m xor (b1 * b2)
        println("$b1 $b2")
    }
}




