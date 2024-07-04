package model;

import model.banco.Banco;
import model.cliente.Cliente;
import model.conta.ContaCorrente;
import model.conta.ContaPoupanca;

public class MainBanco {
    public static void main(String[] args) {
        Banco itau = new Banco("Itaú");
        ContaCorrente clienteCc = new ContaCorrente(new Cliente("Matheus", "86238601523"));
        ContaPoupanca clienteCp = new ContaPoupanca(new Cliente("Junior", "86955789015"));

        itau.adicionarConta(clienteCc);
        itau.adicionarConta(clienteCp);

        itau.exibirContas();
    }
}
