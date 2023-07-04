package Ex8
/*
4. Escrever um programa que leia o nome de N alunos e as notas das
três provas que ele obteve no semestre. No final informar o nome do
aluno e a sua média (aritmética)
Obs: use vetores para a resolução do exercício
 */
fun main() {
ExercicioOito().receberDados()
}

class ExercicioOito {
    var nomeAlunos = arrayOf<String>()
    var notas = arrayOf<Double>()

    fun receberDados(){
        println("Informe a quantidade de alunos: ")
        val  qtAlunos = readln().toInt()

        for (i in 1..qtAlunos){
            println("Informe o nome do aluno: ")
            nomeAlunos = nomeAlunos.plus(readln())

            println("Informe a primeira nota:")
            val nota1 = readln().toDouble()
            println("Informe a segunda nota:")
            val nota2 = readln().toDouble()
            println("Informe a terceira nota:")
            val nota3 = readln().toDouble()

            val media = (nota1 + nota2 + nota3) /3
            notas = notas.plus(media)
        }
        var contador = 0
        for (i in nomeAlunos){
            println("O aluno $i obteve a média: ${notas[contador]}")
            ++contador
        }
    }
}

