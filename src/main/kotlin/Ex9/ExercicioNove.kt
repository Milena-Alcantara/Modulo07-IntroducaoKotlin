package Ex9

fun main() {
ExercicioNove().receberTemperatura()
}
class ExercicioNove {
    fun receberTemperatura(){
        println("Informe a temperatura em ºC:")
        val tempCelsius = readln().toDouble()
        converterTemperatura(tempCelsius)
    }

    fun converterTemperatura(temp: Double){
        val fahrenheit = (9*temp+160)/5
        println("A temperatura informada em Fahrenheit é: $fahrenheit")
    }
}