package br.edu.fatecpg.tecprog.heranca.atividade2.model;

public class PagamentoCartao implements Pagamento {

	private double valor;

	public PagamentoCartao(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularPagamento() {
		return valor * 1.05;
	}

	@Override
	public String emitirRecibo() {
		return "Pagamento no CARTÃO\n" + "Valor original: R$ " + valor + "\n" + "Taxa: 5%\n" + "Valor final: R$ "
				+ calcularPagamento();
	}
}
