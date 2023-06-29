package Ex7


fun main(){
    println("A área do retângulo é: "+ Exercicio7().calcularArea())
}

class Exercicio7{
    fun calcularArea():Double{
        println("Informe a altura do retângulo: ")
        var altura = readln().toDouble()
        println("Informe a base do retângulo: ")
        var base = readln().toDouble()

        return altura*base
    }
}

