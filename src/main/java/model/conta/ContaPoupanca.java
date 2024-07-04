package model.conta;

import model.cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println(String.format("Saque de R$%.2f realizado na sua conta poupança.", valor));
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println(String.format("Depósito de R$%.2f realizado na sua conta poupança.", valor));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println(String.format("Transferência de R$%.2f realizada para %s, agência %d e conta %d.", valor, this.cliente, this.agencia, this.numeroConta));
    }

    @Override
    public void mostrarExtrato() {
        System.out.println("--- EXTRATO DA CONTA POUPANÇA ---");
        System.out.println(String.format("Cliente: %s", this.cliente));
        System.out.println(String.format("Ag: %d", this.agencia));
        System.out.println(String.format("Cp: %d", this.numeroConta));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }
    
}
