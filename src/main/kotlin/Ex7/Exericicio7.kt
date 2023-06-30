package Ex7

fun main() {
    println("Qual a quantidade de alunos:")
    Exericicio7().calcularMediaAlunos(readln().toInt())

}
class Exericicio7{
    fun calcularMediaAlunos(quantAlunos: Int){
        var notas = arrayOf<Int>()

        for (i in 1..quantAlunos){
            println("Por favor, informe as notas:")
            notas = notas.plus(readln().toInt())
        }
        val media = (notas.sum()/quantAlunos)
        println("A média dos alunos é $media")
    }

}