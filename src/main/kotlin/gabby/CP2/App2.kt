package gabby.CP2

fun main(){
    do{
        println("Masukkan angka:")
        val number = readLine()?.toInt() ?: 0

        if(number % 11 == 0){
            println("$number is a multiple by 11")
        }else if(number == 0){
            break
        }else{
            println("$number is not a multiple by 11")
        }
    }while(number != 0)
}