package model.conta;

import model.cliente.Cliente;

public abstract class Conta {
    // Variáveis constantes para determinação de agência e conta
    private static final int AGENCIA_BANCO = 1;
    private static int SEQUENCIAL_CONTA = 0;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_BANCO;
        this.numeroConta = SEQUENCIAL_CONTA++;
        this.cliente = cliente;
    }

    // Métodos abstratos para as classes conta corrente e conta poupança
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void transferir(double valor, Conta contaDestino);
    public abstract void mostrarExtrato();

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Agência: " + agencia + " Conta: " + numeroConta + "\nCliente: " + cliente;
    }

    
}
