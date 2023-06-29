package Ex8
var x = 10
var y = 30
var z = x

fun main(){
    converterVariaveis()
}

fun converterVariaveis(){
    x = y
    y = z
    println("Valor de X: $x")
    println("Valor de Y: $y")
}