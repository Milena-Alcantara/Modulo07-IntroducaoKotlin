package Ex4

fun main() {
exercicioQuatro().receberValores()
}

class exercicioQuatro{

    fun receberValores(){
        println("Informe a base do retângulo: ")
        val base = readln().toDouble()
        println("Informe a altura do retângulo: ")
        val altura = readln().toDouble()
        calcularArea(base, altura)
    }

    fun calcularArea(base: Double, altura: Double){
        val area = base * altura
        println("A área do retângulo é: $area")
    }
}

