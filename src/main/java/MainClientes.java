import model.cliente.Cliente;
import model.conta.ContaCorrente;
import model.conta.ContaPoupanca;

public class MainClientes {
    public static void main(String[] args) {

        ContaCorrente clienteCc = new ContaCorrente(new Cliente("Matheus", "86238601523"));
        ContaPoupanca clienteCp = new ContaPoupanca(new Cliente("Junior", "86955789015"));

        clienteCc.mostrarExtrato();
        clienteCp.mostrarExtrato();

        System.out.println("---------------------------------------");

        clienteCc.depositar(200);
        clienteCc.mostrarExtrato();

        System.out.println("---------------------------------------");

        clienteCp.depositar(500);
        clienteCp.mostrarExtrato();

        System.out.println("---------------------------------------");

        clienteCc.transferir(100, clienteCp);
        clienteCc.mostrarExtrato();
        clienteCp.mostrarExtrato();

        System.out.println("---------------------------------------");

        clienteCp.sacar(500);
        clienteCc.mostrarExtrato();
        clienteCp.mostrarExtrato();
    }
}