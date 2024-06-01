package banco.model;

public interface Banco {
    public Conta criaContaCorrente(Cliente cliente);
    public Conta criaContaPoupanca(Cliente cliente);
}
