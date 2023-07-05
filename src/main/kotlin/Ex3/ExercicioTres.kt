package Ex3

fun main() {
ExercicioTres().calcularCompras()
}

class ExercicioTres {

    fun calcularCompras(){
        var valoresProdutos = arrayOf<Double>()
        println("Informe quantos produtos você comprou: ")
        val qtProdutos = readln().toInt()

        for (i in 1..qtProdutos){
            println("Informe o preço")
            valoresProdutos = valoresProdutos.plus(readln().toDouble())
        }
        println("O valor total da compra: ${valoresProdutos.sum()}")
    }
}
