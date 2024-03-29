package gabby.CP1

data class ArrayOfNumchar (val index: Int, val value: Char)

fun main() {
    val numchar = arrayOf(
        ArrayOfNumchar(2, 'd'),
        ArrayOfNumchar(3, 'c'),
        ArrayOfNumchar(1, 'b'),
        ArrayOfNumchar(5, 'e'),
        ArrayOfNumchar(4, 'a')
    )

    val sortedNumchar = numchar.sortedBy { it.index }

    for (ArrayOfNumchar in sortedNumchar) {
        println("${ArrayOfNumchar.index}. ${ArrayOfNumchar.value}")
    }
}