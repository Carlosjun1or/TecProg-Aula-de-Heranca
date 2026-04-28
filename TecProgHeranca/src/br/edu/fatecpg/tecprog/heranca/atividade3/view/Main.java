package br.edu.fatecpg.tecprog.heranca.atividade3.view;

import java.util.Scanner;
import br.edu.fatecpg.tecprog.heranca.atividade3.model.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SistemaSeguranca sistema = new SistemaSeguranca();

		String usuario, senha;

		do {
			System.out.print("Digite o usuário: ");
			usuario = sc.nextLine();

			System.out.print("Digite a senha: ");
			senha = sc.nextLine();

			if (!sistema.login(usuario, senha)) {
				System.out.println("\nLogin inválido, tente novamente.\n");
			}

		} while (!sistema.isAutenticado());

		System.out.println("\nLogado. Bem-vindo ao sistema!");

		System.out.println("\nDeseja sair? (s/n)");
		String opcao = sc.nextLine();

		if (opcao != null && opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
			sistema.logout();
		} else if (opcao.equalsIgnoreCase("n") || opcao.equalsIgnoreCase("nao") || opcao.equalsIgnoreCase("não")) {
			System.out.println("Logout cancelado.");
		} else {
			System.out.println("Opção inválida! Digite 's' para sair ou 'n' para continuar: ");
		}
	}
}