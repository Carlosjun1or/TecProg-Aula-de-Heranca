package br.edu.fatecpg.tecprog.heranca.atividade1.view;

import br.edu.fatecpg.tecprog.heranca.atividade1.model.*;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Faxineiro faxineiro = new Faxineiro();

        System.out.println("=== GERENTE ===");
        gerente.baterPonto();
        gerente.fecharCaixa();

        System.out.println("\n=== VENDEDOR ===");
        vendedor.baterPonto();
        vendedor.realizarVenda();

        System.out.println("\n=== FAXINEIRO ===");
        faxineiro.baterPonto();
        faxineiro.solicitarMaterial();
    }
}