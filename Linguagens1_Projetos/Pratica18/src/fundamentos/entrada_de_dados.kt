package fundamentos

fun main() {
    print("Informe seu nome:")
    var nome = readLine()
    println("Nome informado: $nome")
    println("Tamanho: ${nome!!.length}")
}