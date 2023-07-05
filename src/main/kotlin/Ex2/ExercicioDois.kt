package Ex2

fun main() {
    ExercicioDois().receberNumero()
}

class ExercicioDois {
    fun receberNumero(){
        var vetor = IntArray(10)
        println("Informe um número")
        vetor[0] = readln().toInt()
        multiplicaNumeros(vetor)
    }
    fun multiplicaNumeros(vetor: IntArray){
        for (i in 1 until vetor.size ){
           vetor[i] = vetor[i-1] * 2
        }
        println()
        for (i in vetor){
            print("$i ")
        }
    }
}
