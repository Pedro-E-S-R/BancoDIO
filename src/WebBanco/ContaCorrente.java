package WebBanco;

public class ContaCorrente extends  Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void emprestimo(double valor){
        super.saldo += valor;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

    }
}
