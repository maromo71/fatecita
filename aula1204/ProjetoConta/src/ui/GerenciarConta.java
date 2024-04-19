package ui;

import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {
    List<Conta>lista = new ArrayList<>();

    private double totalSaldos;

    public double getTotalSaldos() {
        for(Conta conta : lista){
            totalSaldos+= conta.getSaldo();
        }
        return totalSaldos;
    }

    public static void main(String[] args) {
        Corrente corrente = new Corrente();
        corrente.setNumero(1);
        corrente.setNomeCliente("Maromo");
        corrente.setLimiteEspecial(1000);
        corrente.depositar(1500);
        corrente.sacar(200);

        Poupanca poupanca = new Poupanca();
        poupanca.setNumero(2);
        poupanca.setNomeCliente("Maromo");
        poupanca.setDiaAniversario(12);
        poupanca.depositar(5000);

        GerenciarConta gc = new GerenciarConta();
        gc.lista.add(corrente);
        gc.lista.add(poupanca);


        System.out.println("Saldo de todas as contas: ");
        System.out.println(gc.getTotalSaldos());

        for(Conta conta : gc.lista){
            System.out.println(conta);
            System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.");
        }

    }
}
