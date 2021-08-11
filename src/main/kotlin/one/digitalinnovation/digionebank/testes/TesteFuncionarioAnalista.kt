package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista(nome = "abc", cpf = "78900", salario = 2000.0)
    /*
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
    println("----------------------------------------------")
    */
    ImprimeRelatorioFuncionario.imprime(joao)

}

//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())