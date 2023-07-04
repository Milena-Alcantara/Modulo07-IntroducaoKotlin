package Ex10

fun main() {
ExercicioDez().receberValorEmDolar()
}

class ExercicioDez {
    fun receberValorEmDolar(){
        println("Informe o valor que deseja converter: ")
        val dolar = readln().toDouble()

        println("Informe o cotação do dólar")
        val cotacao = readln().toDouble()

        converterParaReais(dolar,cotacao)
    }
    fun converterParaReais(dolarValor: Double, cotacao: Double){
        val valorReais = dolarValor/cotacao
        println("O valor em R$%.2f".format(valorReais))
    }
}