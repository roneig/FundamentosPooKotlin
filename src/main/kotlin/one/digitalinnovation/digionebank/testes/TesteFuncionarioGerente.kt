package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val jose = Gerente(nome = "abcdef", cpf = "78900123", salario = 5000.0, senha = "senha122")
    ImprimeRelatorioFuncionario.imprime(jose)
    TesteAutenticacao().autentica(jose)
}

//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())

