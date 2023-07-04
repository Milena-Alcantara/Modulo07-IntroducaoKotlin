package Ex11

fun main() {
ExercicioOnze().receberValor()
}

class ExercicioOnze{
    fun receberValor(){
        println("Qual o valor de custo do produto?: ")
        val precoCusto = readln().toDouble()

        println("Qual o % de acréscimo para venda?: ")
        val acrescimo = readln().toDouble()
        calcularValorVenda(precoCusto,acrescimo)
    }

    fun calcularValorVenda(precoCusto: Double, percentual: Double){
        val venda = precoCusto + (precoCusto * (percentual/100))
        println("O valor de venda do produto será de: R$%.2f".format(venda))
}}
