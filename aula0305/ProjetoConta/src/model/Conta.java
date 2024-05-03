package model;

import exception.ContaException;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) throws ContaException {
        if(valor > 0){
            saldo += valor;
        }else{
            throw new ContaException("RF01EX02");
        }
    }
    public void sacar(double valor) throws ContaException {
        if(valor <= saldo){
            saldo -= valor;
        }else{
            throw new ContaException("RF01EX01");
        }
    }
}
