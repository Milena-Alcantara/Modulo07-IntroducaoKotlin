package Ex1

fun main() {
    println("A soma do 1 até o número informado é: ${exercicioUm().somarNumero(exercicioUm().receberNumero())}")
}
class exercicioUm{
    fun receberNumero():Int{
        println("Informe o número: ")
        val numero = readln().toInt()
        return numero
    }
    fun somarNumero(numero: Int): Int{
        var soma = 0
        for (i in 1..numero){
             soma += i
        }
        return soma
    }
}

