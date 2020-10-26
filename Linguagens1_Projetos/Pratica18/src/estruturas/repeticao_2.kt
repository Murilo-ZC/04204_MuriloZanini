package estruturas

fun main() {
    var x : Int
    for (x in 1..10){
        println("$x")
    }
    val lista_de_nomes = listOf("Inuyasha", "Kagome", "Kikio", "Seichomaru")
    var nome : String
    for (nome in lista_de_nomes){
        println(nome)
    }
}