package Ex11

fun main() {
    Exercicio11().mediaDosNumerosDosUsuariso()
}
class Exercicio11 {

    fun mediaDosNumerosDosUsuariso(){
        var vetorNumeros = arrayOf<Int>()
     for (i in 1..15){
         println("Informe o número desejado: ")
         vetorNumeros = vetorNumeros.plus(readln().toInt())
     }
        var mediaNumeros = (vetorNumeros.sum()/vetorNumeros.size)
        println("A média dos números digitados é $mediaNumeros")
    }


}