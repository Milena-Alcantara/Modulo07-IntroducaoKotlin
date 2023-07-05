package Ex10


fun main() {
  ExercicioDez().verificarSeNumerosSaoIguais()
}
class ExercicioDez {
    fun verificarSeNumerosSaoIguais(){
        print("Informe o primeiro número: ")
        val numX = readln().toInt()
        print("Informe o segundo número: ")
        val numY = readln().toInt()
        if (numX == numY){
            println("Os números digitados são iguais.")
        }else{
        println("Os números não são iguais.")
    }
}}
