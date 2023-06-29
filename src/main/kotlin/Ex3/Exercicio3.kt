package Ex3

fun main(){
    println("Informe um número:")
    Exercicio3().verificaSeEModuloDeCinco(readln().toInt())
}
class Exercicio3{
    fun verificaSeEModuloDeCinco(num: Int): Boolean{
        if (num % 5 ==0){
            println("O número é múltiplo de 5.")
            return true
        }
        println("O número não é múltiplo de 5.")
        return false
    }
}
