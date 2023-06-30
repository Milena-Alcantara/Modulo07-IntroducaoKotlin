package Ex2
import java.lang.IllegalArgumentException

fun main() {
    println("Informe um dia da semana entre 1 e 7: ")
    Exercicio2().mostarDiadaSemana(readln().toInt())
}

class Exercicio2 {

    fun mostarDiadaSemana(numero : Int){
        if (numero>0 && numero<8){
            val diasSemana = arrayOf("Segunda-Feira", "Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sábado",
                "Domingo")
                println("O dia é: "+diasSemana[numero-1])

            }else{
                throw IllegalArgumentException("Não existe dia da semana para o número informado.")
            }

}}