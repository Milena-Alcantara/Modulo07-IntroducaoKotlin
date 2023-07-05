package Ex8

fun main() {
    ExercicioOito().receberNome()
}

class ExercicioOito {
    fun receberNome(){
        println("Digite seu nome completo:")
        val nome = readln()

        mostrarNome(nome)
    }

    fun mostrarNome(nome:String){
        var nomeQuebrado = nome.split(" ")
        for (nome in nomeQuebrado){
            println("$nome \n")
        }
}

}