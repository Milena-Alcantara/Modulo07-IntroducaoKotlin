package Ex6

import java.util.Arrays

fun main() {
ExercicioSeis().criarVetorComOsNumeros()
}
class ExercicioSeis {
    fun criarVetorComOsNumeros(){
        println("Informe quantos números deseja informar: ")
        val quantNumeros = readln().toInt()
        var vetorNumeros = arrayOf<Int>()
        for (i in 1..quantNumeros) {
            println("Digite um número")
            vetorNumeros = vetorNumeros.plus(readln().toInt())
        }
        verificarMenorNumero(vetorNumeros)
    }
    fun verificarMenorNumero(vetor: Array<Int>){
        println("O menor número dos informados é: ${vetor.min()}")
    }
}

