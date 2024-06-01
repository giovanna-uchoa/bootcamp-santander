package banco.model.conta;
import banco.model.Cliente;
import banco.model.Conta;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente,int agencia,int numero) {
        super(cliente, agencia, numero);
    }
    
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println(this + "\nSaldo: "+ this.saldo);;
    }
    
}
