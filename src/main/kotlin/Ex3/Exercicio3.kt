package Ex3

fun main() {
    Exercicio3().mostrarMensagem()
}

class Exercicio3{
fun mostrarMensagem(){
    var contador = 0
    val mensagem = "Eu gosto de estudar algoritmos. "
    while (contador!=20){
            println(mensagem + contador)
            ++contador
        }
}
}
