package Ex7

fun main() {
ExercicioSete().recerberDadosVendedor()
}

class ExercicioSete {
    fun recerberDadosVendedor(){
        println("Informe o nome do vendedor:")
        val nome = readln()

        println("Informe o salário: ")
        var salario = readln().toDouble()

        println("Informe o valor realizado de vendas: ")
        val vendas = readln().toDouble()

        calcularComissao(nome, salario, vendas)
    }
    fun calcularComissao(nome: String, salario: Double, vendas: Double){
        println("O salário atualizado do vendedor $nome é: ${(vendas*0.15)+salario}")
    }
}