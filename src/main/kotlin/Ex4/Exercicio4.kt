package Ex4

fun main(){
    println("Qual o grau da temperatura de hoje?")
    Exercicio4().verificarTemperadura(readln().toDouble())
    println("Qual o grau da temperatura de hoje?")
    Exercicio4().verificarTemperaturaComWhen(readln().toDouble())

}
class Exercicio4 {
    fun verificarTemperadura(temp: Double){
        if (temp<=18){
            println("Está frio.")
        }else if (temp>=19 && temp<=23.9){
            println("O clima está agradável.")
        }else if (temp<=24 && temp<=35){
            println("O clima está quente.")
        }else{
            println("O clima está muito quente.")
        }
    }
    fun verificarTemperaturaComWhen(temp: Double){
        when{
            temp <=18 -> println("Está frio.")
            temp>=19 && temp<=23.9 -> println("O clima está agradável.")
            temp<=24 && temp <=35 -> println("O clima está quente.")
            else ->{
                println("O clima está muito quente.")
            }
        }
    }
}

