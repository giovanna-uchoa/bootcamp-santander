package banco;

import banco.model.Banco;
import banco.model.Cliente;
import banco.model.Conta;
import banco.model.banco.BancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
        Banco dio = new BancoDigital("dio");

		Conta cc = dio.criaContaCorrente(venilton);;
		Conta poupanca = dio.criaContaPoupanca(venilton);

		try {
            cc.depositar(100.0);
            cc.transferir(50.0, poupanca);
            cc.sacar(25.0);
        } catch (Exception valorInvalidoException) {
            System.out.println("Valor inválido");
        }
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
