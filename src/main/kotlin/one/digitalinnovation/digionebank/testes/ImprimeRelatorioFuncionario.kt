package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario{
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}
// método estático onde eu consigo invocá-lo via classse e não via instância