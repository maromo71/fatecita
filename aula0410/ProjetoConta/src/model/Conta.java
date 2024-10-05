package model;

public abstract class Conta {
    private int numero;
    private String nomeCliente;
    private double saldo;

    public Conta(int numero, String nomeCliente) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cobrarTarifa();
            return true;
        }
        return false;
    }
    public boolean depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dados da conta: \n" +
                "Num. Conta: " + numero + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Saldo: " + saldo + "\n";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract void cobrarTarifa();
}
