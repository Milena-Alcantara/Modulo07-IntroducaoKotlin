package Ex1

fun main() {
ExercicioUm().receberNumeros()
}

class ExercicioUm {
    fun receberNumeros(){
        print("Informe o primeiro número: ")
        val num1 = readln().toInt()
        print("Informe o segundo número: ")
        val num2 = readln().toInt()

        calcularMultiplosDeTreze(num1, num2)
    }
   fun calcularMultiplosDeTreze(num1: Int, num2: Int){
       var soma = 0
       if (num1<num2){
           for (i in num1..num2){
               if (!(i % 13 == 0))
               soma += i
           }
       }else{
           for (i in num2..num1){
               if (!(i % 13 == 0))
                   soma += i
           }
       }
       println(soma)
   }
}
