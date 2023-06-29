package Ex6

fun main(){
    println("Informe o valor que deseja converter: ")
    val mensagem = "O valor convertido em reais é: "
    println(mensagem +(Exercicio6().converteParaReal(readln().toDouble())))
}
class Exercicio6 {
    fun converteParaReal(valor: Double): Double {
        return valor * 4.86
    }

}
