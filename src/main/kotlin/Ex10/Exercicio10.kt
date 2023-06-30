package Ex10

fun main() {
    Exercicio10().somarNumeros()
}

class Exercicio10 {
    fun somarNumeros(){
        var numeroSomados = 0
        var numero = 1
        do {
            numeroSomados += numero
            ++numero
        }while (numero<16)
        println("A soma dos números é: $numeroSomados")
    }
}