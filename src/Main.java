import WebBanco.Cliente;
import WebBanco.Conta;
import WebBanco.ContaCorrente;
import WebBanco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setName("Pedro");

        ContaCorrente cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);
        cc.emprestimo(1000);
        cc.depositar(100);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}