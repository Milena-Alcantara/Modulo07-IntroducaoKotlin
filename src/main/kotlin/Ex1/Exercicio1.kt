package Ex1

fun main(){
    Exercicio1().calculaNumerosDeUmVetor()
}

class Exercicio1 {
    fun calculaNumerosDeUmVetor(){
        var numeros = IntArray(5)
        for (posicao in numeros.indices){
            println("Informe um numero: ")
            numeros[posicao]= readln().toInt()
        }
        var soma = numeros.sum()
        println("A soma de todos os números digitados é: $soma")

    }

}

