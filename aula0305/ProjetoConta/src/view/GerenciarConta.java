package view;
import exception.ContaException;
import model.Conta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarConta {
    List<Conta> contas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int posicao = 0;
    public static void main(String[] args) {
       try {
           GerenciarConta gc = new GerenciarConta();
           int opcao = 0;
           do{
               System.out.println("Menu Principal");
               System.out.println("1. Cadastrar Conta");
               System.out.println("2. Depositar");
               System.out.println("3. Sacar");
               System.out.println("4. Saldo");
               System.out.println("9. Sair");
               opcao = Integer.parseInt(gc.sc.nextLine());
               switch (opcao){
                   case 1:
                       gc.execCadastrar();
                       break;
                   case 2:
                       gc.execDepositar();
                       break;
                   case 3:
                       gc.execSacar();
                       break;
                   case 4:
                       gc.execSaldo();
                       break;
                   case 9:
                       System.out.println("Fim do Programa");
                       break;
                   default:
                       System.out.println("Opção inválida");
               }
           }while(opcao != 9);
       }catch (Exception ex){
           System.out.println("Erro: " + ex.getMessage());
       }
    }
    public void execCadastrar(){
        System.out.println("Cadastrando conta na posiçao: " + posicao);
        Conta conta = new Conta();
        contas.add(conta); //adicionei a nova conta na lista
        posicao++;
    }
    public void execDepositar(){
        try{
            System.out.println("Qual a conta a depositar ?");
            int posDep = Integer.parseInt(sc.nextLine());
            Conta conta = contas.get(posDep);
            System.out.println("Qual o valor do depósito? ");
            double valor = Double.parseDouble(sc.nextLine());
            try {
                conta.depositar(valor);
                System.out.println("Depósito efetuado com sucesso");
            } catch (ContaException e) {
                System.out.println("Erro ao depositar: " + e.getMessage());
            }
        }catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    public void execSacar(){
       try{
           System.out.println("Qual a conta a sacar ?");
           int posSaque = Integer.parseInt(sc.nextLine());
           Conta conta = contas.get(posSaque);
           System.out.println("Qual o valor do saque? ");
           double valor = Double.parseDouble(sc.nextLine());
           try {
               conta.sacar(valor);
               System.out.println("Saque efetuado com sucesso");
           } catch (ContaException e) {
               System.out.println("Erro ao sacar: " + e.getMessage());
           }
       }catch (Exception ex){
           System.out.println("Erro: " + ex.getMessage());
       }
    }
    public void execSaldo(){
        try{
            System.out.println("Qual a conta quer ver o saldo ?");
            int posSaldo = Integer.parseInt(sc.nextLine());
            Conta conta = contas.get(posSaldo);
            System.out.println("Saldo é: " + conta.getSaldo());
        }catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }

    }

}