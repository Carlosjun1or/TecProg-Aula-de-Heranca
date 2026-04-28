package br.edu.fatecpg.tecprog.heranca.atividade2.view;

import java.util.Scanner;
import br.edu.fatecpg.tecprog.heranca.atividade2.model.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do pagamento: R$ ");
		double valor = sc.nextDouble();

		Pagamento cartao = new PagamentoCartao(valor);
		Pagamento dinheiro = new PagamentoDinheiro(valor);

		System.out.println("\n=== PAGAMENTO COM CARTÃO ===");
		System.out.println(cartao.emitirRecibo());

		System.out.println("\n=== PAGAMENTO EM DINHEIRO ===");
		System.out.println(dinheiro.emitirRecibo());
	}
}