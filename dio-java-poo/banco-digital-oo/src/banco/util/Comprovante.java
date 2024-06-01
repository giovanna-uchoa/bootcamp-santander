package banco.util;

import java.util.Date;

import banco.model.Conta;

public class Comprovante {

    private Date   data;
    private Conta  remetente;
    private Conta  destinatario;
    private double valor;

    public Comprovante(Conta remetente, Conta destinatario, double valor){
        this.data = new Date(System.currentTimeMillis());
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Comprovante de Transferência\n Data: "+getData().toString()
                +"\n Conta Remetente: "+getRemetente().toString()
                +"\n Conta Destinatária: "+getDestinatario().toString()
                +"\n Valor da Transferência: "+getValor();
    }

    public Date getData() {
        return data;
    }

    public Conta getRemetente() {
        return remetente;
    }

    public Conta getDestinatario() {
        return destinatario;
    }

    public double getValor() {
        return valor;
    }

}
