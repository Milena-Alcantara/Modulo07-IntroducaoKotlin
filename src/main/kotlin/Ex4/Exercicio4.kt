package Ex4
fun main() {
    Exercicio4().receberNumeros()
}

class Exercicio4 {
    fun receberNumeros(){
        var numeros = IntArray(10)
        for (posicao in numeros.indices){
            println("Informe um numero: ")
            numeros[posicao]= readln().toInt()
        }

        println("Os número pares são: ")
        for (numero in numeros){
            if (numero % 2==0){
                print("$numero ")
            }
        }
    }
}