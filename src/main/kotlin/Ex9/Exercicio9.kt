package Ex9
/*9. Escreva um algoritmo que leia dois números e apresente um menu
com 4 opções:
a. 1) Somar os números;
b. 2) Subtrair os números;
c. 3) Multiplicar os números;
d. 4) Dividir os números. Leia a opção do usuário e execute a
operação e apresente o resultado. Caso a opção digitada seja
inválida, apresente a mensagem de “Opção inválida” para o
usuário
 */

fun main() {
    Exercicio9().calcular()
}

class Exercicio9 (){
    fun calcular(){
        println("Informe o primeiro número: ")
        var num1 = readln().toInt()

        println("Informe o segundo número: ")
        var num2 = readln().toInt()

        println("Escolha a opção desejada: \n 1- Somar \n 2- Subtrair \n 3- Multiplicar \n 4- Dividir")
        when(readln().toInt()){
           1 -> println("A soma é: ${num1+num2}")
           2 -> println("A subtração é: ${num1-num2}")
           3 -> println("A multiplicação é: ${num1*num2}")
           4 -> println("A divisão é: ${num1/num2}")

          else -> println("Opção inválida")
        }
    }
}