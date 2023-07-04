package Ex3

fun main() {
    exercicioTres().receberDados()
}

class exercicioTres{

    fun receberDados(){
        println("Digite seu peso: ")
        var peso = readln().toDouble()

        println("Digite sua altura: ")
        var altura = readln().toDouble()
        calcularImc(peso, altura)
    }

    fun calcularImc(peso: Double, altura: Double){
        var imc = peso / (altura * altura)

        when{
           imc <18.5 -> println("Imc: Magreza Grau 0")
           imc in 18.5..24.9 -> println("Imc: Normal Grau 0")
           imc in 25.0..29.9 -> println("Imc: Sobrepeso Grau I")
           imc in 30.0..39.9 -> println("Imc: Obesidade Grau II")
           imc >40.0 -> println("Imc: Obesidade Grave Grau III")

           else -> {
               println("Impossível calcular IMC")
           }
        }
    }
}
