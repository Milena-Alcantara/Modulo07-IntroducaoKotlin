package Ex10

fun main(){
    println("Informe um número: ")
   println("O Sucessor é: ${Exercicio10().mostrarSucessor(readln().toInt())}")
}

class Exercicio10(){
    fun mostrarSucessor(numero : Int): Int {
        return numero +1
    }
}