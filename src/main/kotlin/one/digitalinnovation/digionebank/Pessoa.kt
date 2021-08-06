package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "ronei"
    //private set
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

/*
    setCpf(cpf: String ) {
        this.cpf = cpf
    }
*/
/*  Pessoa é a outer class
    inner class Endereco {
        var rua: String = "Rua teste"
    }
*/
}

fun main() {
    val ronei = Pessoa()
    println(ronei)
    println(ronei.nome + " " + ronei.cpf)
    //ronei.cpf = "123456"
    //ronei.setCpf("123456")

    ronei.nome = "ronei2"
    println(ronei.nome + " " + ronei.cpf)

    //println(ronei.Endereco().rua)

    println(ronei.pessoaInfo())

}