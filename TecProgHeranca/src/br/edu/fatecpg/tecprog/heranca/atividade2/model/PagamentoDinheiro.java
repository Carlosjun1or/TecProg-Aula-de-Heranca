package br.edu.fatecpg.tecprog.heranca.atividade2.model;

public class PagamentoDinheiro implements Pagamento {

	private double valor;

	public PagamentoDinheiro(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularPagamento() {
		return valor * 0.90;
	}

	@Override
	public String emitirRecibo() {
		return "Pagamento em DINHEIRO\n" + "Valor original: R$ " + valor + "\n" + "Desconto: 10%\n" + "Valor final: R$ "
				+ calcularPagamento();
	}
}
