package Ex1
fun main(){
    println("Informe um número: ")
    println("O antecessor é: ${Exercicio1().mostrarAntecessor(readln().toInt())}")
}
class Exercicio1{
    fun mostrarAntecessor(numero : Int): Int {
        return numero -1
    }
}








