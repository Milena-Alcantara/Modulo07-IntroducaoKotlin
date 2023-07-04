package Ex2
fun main() {
exercicioDois().exibirMensagem(exercicioDois().receberNome())
}

class exercicioDois{
   fun receberNome(): String{
       println("Digite seu nome: ")
       val nome = readln()
        return nome
   }

    fun exibirMensagem(nome: String){
        println("Meu nome é: $nome")
    }
}
