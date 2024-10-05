import model.Conta;
import model.ContaCorrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarContas {

    private List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        //2 contas (poupanca e conta corrente)
        ContaCorrente conta1 = new ContaCorrente(
                1,
                "Maromo",
                1000.0);
        Poupanca conta2 = new Poupanca(
                2,
                "Maria",
                21);
        conta2.depositar(1000);
        conta2.sacar(50);
        //depositar na conta1 5000.0 e na conta2 1000
        if(conta1.depositar(1500)){
            System.out.println("Depósito efetuado com sucesso!");
        }else{
            System.out.println("Valor inválido para depositar!");
        }
        //sacar 3000 da conta1
        if(conta1.sacar(300)){
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Sem saldo para sacar!");
        }
        System.out.println(conta1);

        GerenciarContas gerenciar = new GerenciarContas();
        gerenciar.adicionarConta(conta1);
        gerenciar.adicionarConta(conta2);

        System.out.println("Gerente tenho "
                + gerenciar.contas.size()
                + " contas");

        //varrer a lista e mostrar todos os dados de todas as contas
        double total = 0;
        for(Conta conta : gerenciar.contas){
            System.out.println(conta);
            total += conta.getSaldo();
        }

        System.out.println("Total do Saldo de Todas as contas: " + total);

    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
}
