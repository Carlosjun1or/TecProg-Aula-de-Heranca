package br.edu.fatecpg.tecprog.heranca.atividade1.model;

public class Faxineiro implements Funcionario {

	@Override
	public void baterPonto() {
		System.out.println("Faxineiro bateu o ponto.");
	}

	public void solicitarMaterial() {
		System.out.println("Material de limpeza solicitado.");
	}
}