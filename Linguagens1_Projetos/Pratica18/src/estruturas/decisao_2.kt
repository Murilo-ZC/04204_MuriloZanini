package estruturas

fun main() {
    val valor = 0

    when (valor){
        56 -> println("Achei!")
        in 1 .. 10 -> println("Entre 1 e 10!")
        //Teste de paridade não
        //valor % 2 -> println("PAR")
        else -> println("Sou opcional!!")
    }
}