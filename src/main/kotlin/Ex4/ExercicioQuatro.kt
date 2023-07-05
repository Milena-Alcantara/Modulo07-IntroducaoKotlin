package Ex4

fun main() {
    ExercicioQuatro().calcularQuantidadeDeGatosOUCachorros()
}

class ExercicioQuatro {

    fun calcularQuantidadeDeGatosOUCachorros(){
        var gatos = 0
        var cachorros = 0
        print("Informe a quantidade de animais: ")
        val qtAnimais = readln().toInt()

        for (i in 1..qtAnimais){
            println("Informe o tipo do animal \n 1- Gato \t 2 - Cachorro")

            when(readln().toInt()){
                1 -> gatos++
                2 -> cachorros++
                else -> println("Tipo de animal inválido")
            }
        }
        println("Sua loja possui $gatos gatos e $cachorros cachorros.")
    }
}
