package Ex12

fun main() {
    Exercicio12().calcular()
}

class Exercicio12 {
    fun calcular(){
        println("Qual seu ano de nascimento")
        var ano = readln().toInt()
        var idade = 0

        while (ano<2023)
        println("No Ano ${++ano}, você tinha ${++idade} anos.")

    }
}