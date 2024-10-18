package model;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String depositar(double valor) {
        if(valor <= 0) {
            return "Valor deve ser positivo";
        }
        saldo += valor;
        return "Depósito efetuado com sucesso";
    }
    public String sacar(double valor) {
        if(valor > saldo){
            return "Sem saldo suficiente";
        }
        saldo -= valor;
        return "Saque efetuado com sucesso";
    }
}
