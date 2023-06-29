package Ex5

fun main(){
    println("Informe um número")
    Exercicio5().verificarSeNumeroENegativo(readln().toInt())
}
class Exercicio5 {
    fun verificarSeNumeroENegativo(num: Int){
        when{
            num >= 0 -> println("O número é positivo.")
            else -> println("O número negativo.")
        }
    }
}

