package br.edu.fatecpg.tecprog.heranca.atividade3.model;

public class SistemaSeguranca implements Autenticavel {

	private String usuarioCorreto = "adm";
	private String senhaCorreta = "123";
	private boolean autenticado = false;

	@Override
	public boolean login(String usuario, String senha) {

		if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
			autenticado = true;
			return true;
		}

		return false;
	}

	@Override
	public void logout() {
		autenticado = false;
		System.out.println("Logout realizado com sucesso.");
	}

	public boolean isAutenticado() {
		return autenticado;
	}
}