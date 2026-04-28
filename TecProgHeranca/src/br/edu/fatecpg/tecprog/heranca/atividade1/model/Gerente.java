package br.edu.fatecpg.tecprog.heranca.atividade1.model;

public class Gerente implements Funcionario {

	@Override
	public void baterPonto() {
		System.out.println("Gerente bateu o ponto.");
	}

	public void fecharCaixa() {
		System.out.println("Gerente fechou o caixa.");
	}
}
