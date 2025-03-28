package model;

public class Conta {
    private int numero;
    private String banco;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    //Métodos de negócios
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return;
        }
        System.out.println("Saldo insuficiente");
    }
    public double exibirSaldo(){
        return saldo;
    }
}
