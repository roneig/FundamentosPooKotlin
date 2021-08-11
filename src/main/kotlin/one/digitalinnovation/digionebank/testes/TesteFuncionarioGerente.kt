package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val jose = Gerente(nome = "abcdef", cpf = "78900123", salario = 4000.0)
    ImprimeRelatorioFuncionario.imprime(jose)
}

//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())

