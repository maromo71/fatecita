package model;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos para sacar e depositar
    public String sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return "Saque efetuado com sucesso";
        }
        return "Sem saldo suficiente";
    }
    public String depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return "Depósito efetuado com sucesso";
        }
        return "Valor inválido para o depósito";
    }
}
