package br.edu.fatecpg.tecprog.heranca.atividade1.model;

public class Vendedor implements Funcionario {

	@Override
	public void baterPonto() {
		System.out.println("Vendedor bateu o ponto.");
	}

	public void realizarVenda() {
		System.out.println("Venda realizada com sucesso!");
	}
}
