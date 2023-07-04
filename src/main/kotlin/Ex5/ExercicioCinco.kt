package Ex5

fun main() {
ExercicioCinco().receberDoiNumeros()
}

class ExercicioCinco {

    fun receberDoiNumeros(){
        println("Informe o primeiro número: ")
        val numero1 = readln().toDouble()
        println("Informe o segundo número: ")
        val numero2 = readln().toDouble()
        calcularNumeros(numero1,numero2)
    }
    fun calcularNumeros(num1: Double, num2: Double){
        println("A soma dos números resulta em: ${num1 + num2}")
        println("A subtração dos números resulta em: ${num1 - num2}")
        println("A multiplicação dos números resulta em: ${num1 * num2}")
        println("A divisão dos números resulta em: ${num1 / num2}")
    }

}
