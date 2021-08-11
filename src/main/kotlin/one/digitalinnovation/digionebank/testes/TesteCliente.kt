package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val maria = Cliente(
        nome = "Maria",
        cpf = "123456789",
        clienteTipo = ClienteTipo.PF,
        senha = "654321"
    )
    println(maria)
    TesteAutenticacao().autentica(maria)
}