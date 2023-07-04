package Ex9

import kotlin.system.exitProcess

fun main() {
    Exercicio9().calcular()
}

class Exercicio9 (){
    fun calcular(){
        var opcaoUser: Int = 0
        while (opcaoUser !=5){
            println("Informe o primeiro número: ")
            var num1 = readln().toInt()

            println("Informe o segundo número: ")
            var num2 = readln().toInt()

            println("Escolha a opção desejada: \n 1- Somar \n 2- Subtrair \n 3- Multiplicar \n 4- Dividir \n 5 - Sair")
            opcaoUser = readln().toInt()
            when(opcaoUser){
                1 -> println("A soma é: ${num1+num2}")
                2 -> println("A subtração é: ${num1-num2}")
                3 -> println("A multiplicação é: ${num1*num2}")
                4 -> println("A divisão é: ${num1/num2}")
                5 -> println(" Saindo... ${exitProcess(0)}")

                else -> println("Opção inválida")
            }
        }

    }
}