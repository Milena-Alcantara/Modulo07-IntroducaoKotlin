package Ex6

fun main() {
    Exercicio().receberInformacoesBanda()
}

class Exercicio (){
    fun receberInformacoesBanda(){
        println("Informe o nome da banda: ")
        val nomeBanda = readln()
        var musicas = arrayOf<String>()

        for (musica in 1..3){
            println("Informe o nome da música: ")
            musicas = musicas.plus(readln())
        }

        println("----------------------------------")
        println("Banda: $nomeBanda")
        println("Músicas:")
        for (musica in musicas){
            print("$musica ")
        }
    }
}