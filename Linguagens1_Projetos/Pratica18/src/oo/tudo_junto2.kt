package oo

enum class Jobs(val job:String){
    TEMPLARIO("Templario"),
    STEVE("Steve"),
    THIEF("Thief"),
    JACKAN("Jackan");
    override fun toString(): String {
        return "$job"
    }
}

interface Upavel{
    fun upar()
}

interface Batalhar{
    fun atacar()
    fun defender()
}

class Personagem(val nome:String):Upavel,Batalhar{
    var nivel : Int = 1
        set(value) {
            if (field > 100 || value <= 0)
                println("Valores invalidos!")
            else
                field = value
        }
    val trabalho: Jobs
    init {
        when(nome.length){
            5 -> this.trabalho = Jobs.STEVE
            in 1..10 -> this.trabalho = Jobs.TEMPLARIO
            in 11..15 -> this.trabalho = Jobs.THIEF
            else -> this.trabalho = Jobs.JACKAN
        }
    }

    override fun upar() {
        println("300 Flexoes!")
        println("300 PushUps")
        println("3km Correr!")
        this.nivel += 1
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }

    override fun defender() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Personagem(nome='$nome', nivel=$nivel, trabalho=$trabalho)"
    }


}

fun main(){
    val personagem1 = Personagem("Jiraya")
    val personagem2 = Personagem("Steve")
    val personagem3 = Personagem("Pain")
    val personagem4 = Personagem("Koan - Orgulho da Profissao")

    val personagens = listOf(personagem1, personagem2, personagem3, personagem4)
    var personagem : Personagem
    for(personagem in personagens){
        println(personagem)
        personagem.upar()
        println(personagem)
        personagem.nivel = -10

    }

}