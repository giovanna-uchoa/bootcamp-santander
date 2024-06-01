package banco.model.banco;

import java.util.ArrayList;
import java.util.List;

import banco.model.Banco;
import banco.model.Cliente;
import banco.model.Conta;
import banco.model.conta.ContaCorrente;
import banco.model.conta.ContaPoupanca;

public class BancoDigital implements Banco {
    
    private final int AGENCIA;

	private String nome;
    private List<Conta> contas;

    public BancoDigital (String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
        AGENCIA = nome.hashCode();
    }

    public Conta criaContaCorrente(Cliente cliente) {
        Conta conta = new ContaCorrente(cliente, AGENCIA, contas.size());
        contas.add(conta);
        return conta;
    }

    public Conta criaContaPoupanca(Cliente cliente) {
        Conta conta = new ContaPoupanca(cliente, AGENCIA, contas.size());
        contas.add(conta);
        return conta;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

    public int getAgencia() {
        return AGENCIA;
    }

}