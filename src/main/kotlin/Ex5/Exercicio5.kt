package Ex5

fun main() {
    Exercicio5().fazerListadeCompras()

}
class Exercicio5 {
    fun fazerListadeCompras(){
        println("Informe quantos itens terá sua lista: ")
       var quantidadeItens = readln().toInt()

        var listaCompras = arrayOf<String>()
        for (posicao in 1.. quantidadeItens){
            println("Informe o item: ")
            listaCompras = listaCompras.plus(readln())
        }
        println("Visualize sua lista de compras: ")
        for (exibe in listaCompras){
            println(exibe)
        }
    }
}