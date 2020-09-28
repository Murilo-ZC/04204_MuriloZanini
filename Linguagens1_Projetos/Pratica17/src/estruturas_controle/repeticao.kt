package estruturas_controle

fun main(){
    var continuar = true
    while (continuar){
        println("Continuar?")
        continuar = readLine()!!.toLowerCase().equals("sim")
    }

    var valor : Int
    for (valor in 1..10)
        println(valor)
}