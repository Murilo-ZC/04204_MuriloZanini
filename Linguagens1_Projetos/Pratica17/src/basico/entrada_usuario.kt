package basico

fun main(){
    print("Informe um nome:")
    var nome = readLine()
    println("Ola $nome")
    println("Informe dois números:")
    val numero1 = readLine()!!.toDouble()
    val numero2 = readLine()!!.toDouble()
    println("Resultado da soma de $numero1 com $numero2 é igual a ${numero1 + numero2}")
}