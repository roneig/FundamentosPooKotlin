package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "ronei"
    var cpf:String = "123.123.123-11"
}

fun main() {
    val ronei = Pessoa()
    println(ronei)
    println(ronei.nome + " " + ronei.cpf)
}