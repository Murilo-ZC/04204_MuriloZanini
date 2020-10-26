package colecoes

fun main() {
    val minhaLista1 = listOf(3, 29, 3, 5, 6)
    //Passar por todos os elementos da lista
    minhaLista1.forEach { println(it) }

    val minhaLista2 = mutableListOf(3, 29, 3, 5, 6)
    minhaLista2.forEach { println(it) }
    minhaLista2.add(-10)
    minhaLista2.add(10)
    minhaLista2.forEach { println(it) }
}