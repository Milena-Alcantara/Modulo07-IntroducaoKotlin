package Ex2

fun main(){
    println("Informe sua idade:")
    println("Você viveu ${Exercicio2().calcularDiasVividos(readln().toInt())} dias.")
}

class Exercicio2 {
    fun calcularDiasVividos(idade: Int): Int{
        return idade * 365
    }
}
