package gabby.CP2

fun main() {
    while(true){
        print("Masukkan input: ")
        val kalimatDoubleQuotes = readLine()
        val ubah= "``" + kalimatDoubleQuotes?.replace("\"", "") + "''"
        println("$ubah")
    }
}
