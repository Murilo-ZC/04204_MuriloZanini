package fundamentos

fun main() {
    print("Informe seu nome:")
    //Elvis Operator
    var nome = readLine() ?: ""
    println("Nome informado: $nome")
    println("Tamanho: ${nome.length}")
}