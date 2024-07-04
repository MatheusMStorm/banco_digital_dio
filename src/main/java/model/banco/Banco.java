package model.banco;

import java.util.ArrayList;
import java.util.List;
import model.conta.Conta;

public class Banco {
    private String nome;
    private List<Conta> contas;
    
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void exibirContas() {
        for (Conta c : contas) {
            System.out.println(c);
        }
    }
}
