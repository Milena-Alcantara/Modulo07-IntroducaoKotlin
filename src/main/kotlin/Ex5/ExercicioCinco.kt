package Ex5

fun main() {
    ExercicioCinco().receberNome()
}
class ExercicioCinco {
    fun receberNome(){
      print("Qual seu nome? : ")
      val nome = readln()
       println(mostrarSaudacao(nome))
    }

    fun mostrarSaudacao(nome: String): String{
        return "Seja Bem vindo(a) $nome!"
    }
}
