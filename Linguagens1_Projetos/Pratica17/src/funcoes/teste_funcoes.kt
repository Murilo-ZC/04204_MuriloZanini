package funcoes

//Declarar uma função
fun SomarDoisNumeros(numero1 : Int, numero2 : Int) : Int {
    return numero1 + numero2
}

//Para funções de uma expressão apenas
fun MultiplicarDoisNumeros(numero1: Double, numero2: Int) = numero1 * numero2

fun main(){
    println("${SomarDoisNumeros(4,79)}")
    println("${MultiplicarDoisNumeros(4.9,79)}")
}