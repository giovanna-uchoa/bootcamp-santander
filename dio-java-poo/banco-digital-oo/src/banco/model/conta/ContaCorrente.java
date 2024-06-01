package banco.model.conta;
import banco.model.Cliente;
import banco.model.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente,int agencia,int numero) {
        super(cliente, agencia, numero);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
		System.out.println(this + "\nSaldo: "+ this.saldo);;
    }
}
