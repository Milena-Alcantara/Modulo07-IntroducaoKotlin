package Ex6
fun main() {
ExercicioSeis().mostrarTabuada()
}

class ExercicioSeis {
    fun mostrarTabuada(){
        for (i in 1..9){
            println()
            println("Tabuada do $i")
            for (j in 0..10){
                println("$i x $j = ${i*j}")
            }
        }
    }
}