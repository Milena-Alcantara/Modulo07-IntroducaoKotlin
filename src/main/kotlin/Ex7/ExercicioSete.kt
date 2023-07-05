package Ex7
fun main() {
ExercicioSete().quantidadeTurma()
}

class ExercicioSete {
    fun quantidadeTurma(){
        print("Informe a quantidade de turmas: ")
        val qtTurmas = readln().toInt()
        var qtAlunos = 0
        var notas = 0
        var media = 0
        var totalAlunos = 0


        for (i in 1..qtTurmas){
            print("Informe a quantidade de alunos para a Turma $i ")
            qtAlunos = readln().toInt()

            for (aluno in 1..qtAlunos ){
                print("Informe a média do aluno $aluno | Turma $i: ")
                notas += readln().toInt()
                totalAlunos++
            }
            media = (notas /totalAlunos)
            println("A média da turma $i é $media")
            println("------------------------------------------------")
        }
    }
}
