package ex9

fun main() {
    ExercicioNove().recerberDadosFuncionarios()
}
class ExercicioNove {
    fun recerberDadosFuncionarios(){
        println("Informe a quantidade de funcionários: ")
        val qtFuncionarios = readln().toInt()
        var nomeFuncionario: String
        var tempoEmMeses = 0
        var temFerias = 0
        var naoTemFerias = 0


        for (i in 1..qtFuncionarios){
            println("Informe o nome do funcionário: ")
            nomeFuncionario = readln()
            println("Informe o tempo de serviço (em meses): ")
            tempoEmMeses = readln().toInt()

            if (tempoEmMeses > 12){
                println("O funcionário $nomeFuncionario tem direito a férias")
                temFerias++
            }else{
                println("O funcionário $nomeFuncionario não tem direito a férias")
                naoTemFerias++
            }
        }
        println("Funcionários que podem ter férias: $temFerias")

        println("Funcionários que NÃO podem ter férias: $naoTemFerias")

    }
}