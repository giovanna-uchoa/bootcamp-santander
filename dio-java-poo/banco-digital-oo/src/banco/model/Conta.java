package banco.model;

import banco.util.Comprovante;
import banco.util.ValorInvalidoException;

public abstract class Conta {

    protected int     agencia;
    protected int     numero;
    protected double  saldo;
    protected Cliente titular;

    public abstract void imprimirExtrato();
    
    public Conta (Cliente cliente, int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = cliente;
    }

    public void sacar(double valor) throws ValorInvalidoException {
        if (valor > saldo) throw new ValorInvalidoException();
        saldo -= valor;
        System.out.printf("Você sacou o valor de %.2f com sucesso!\n", valor);
    };

    public void depositar(double valor) throws ValorInvalidoException {
        if (valor < 0) throw new ValorInvalidoException();
        saldo += valor;
    }

    public Comprovante transferir(double valor, Conta destinatario) throws ValorInvalidoException {
        if (valor > saldo) throw new ValorInvalidoException();
        destinatario.depositar(valor);
        saldo -= valor;
        return new Comprovante(this, destinatario, valor);
    }

    @Override
    public String toString() {
        return String.format("Titular: %s\nAgencia: %d\nNumero: %d\n",
                            this.titular.getNome(), this.agencia, this.numero);
    }

}
