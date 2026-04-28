package br.edu.fatecpg.tecprog.heranca.atividade3.model;

public interface Autenticavel {

	boolean login(String usuario, String senha);

	void logout();
}
