package estruturas

fun main() {
    var contador = -10
    while (contador > 0){
        println("$contador")
        contador -= 1
    }

    do {
        println("$contador")
        contador -= 1
    }while (contador > 0)
}