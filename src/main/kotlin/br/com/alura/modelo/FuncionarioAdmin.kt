package br.com.alura.modelo

import br.com.alura.modelo.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    open fun autenticacao(senha: Int): Boolean = this.senha == senha
}