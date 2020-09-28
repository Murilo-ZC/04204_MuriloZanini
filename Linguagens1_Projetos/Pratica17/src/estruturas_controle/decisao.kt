package estruturas_controle

fun main(){
    val numero = 16
    if (numero % 2 == 0)
        println("Par")
    else
        println("Impar")

    //Simular um ternario
    val numero2 = 43
    val resultado = if (numero2 % 2 == 0) "par" else "impar"
    println("$resultado")

    println("Resultado: ${if (numero2 % 2 == 0) "par" else "impar"}")

    //Elvis operator
    //Deixa explicito que a variável pode receber um valor nulo
    var nome : String?
    nome = "Miguel"
    println(nome)
    nome = null
    println("${nome ?: "Ryu"}")
}