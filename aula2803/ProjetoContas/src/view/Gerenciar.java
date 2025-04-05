package view;
import model.Conta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciar {
    private List<Conta> contas = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Gerenciar gerenciar = new Gerenciar();
        int opcao = 0;
        do{
            System.out.println("Menu Principal - Gerenciar Contas");
            System.out.println("1 - Adicionar Conta");
            System.out.println("2 - Sacar da Conta");
            System.out.println("3 - Depositar em Conta");
            System.out.println("4 - Saldo da Conta");
            System.out.println("5 - Saldo de Todas as Contas");
            System.out.println("9 - Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(gerenciar.input.nextLine());
            switch (opcao){
                case 1 -> gerenciar.execCadastrar();
                case 2 -> gerenciar.execSacar();
                case 3 -> gerenciar.execDepositar();
                case 4 -> gerenciar.execConsultar();
                case 5 -> gerenciar.execListar();
                case 9 -> {
                    System.out.println("Fim do programa");
                }
                default -> {
                    System.out.println("Opção inválida");
                }
            }
        }while(opcao !=9);
        System.out.println("Acabou o programa!");
    }
    public static void execCadastrar(){
        Conta conta  = new Conta();
        System.out.println("Digite o numero da conta: ");
        conta.setNumero(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o nome do Banco: ");
        conta.setBanco(input.nextLine());
        System.out.println("Conta cadastrada com sucesso!");
        contas.add(conta); //Adiciona a conta na lista
    }
    public void execConsultar(){
        Conta contaBuscada = null;
        System.out.println("Digite o numero da conta: ");
        int numero = Integer.parseInt(input.nextLine());
        contaBuscada = buscarContaNaLista(numero);
        if(contaBuscada == null){
            System.out.println("Conta não cadastrada ou encontrada");
        }else{
            System.out.println("Conta: " + contaBuscada.getNumero());
            System.out.println("Saldo da Conta: " + contaBuscada.exibirSaldo());
        }
    }

    private Conta buscarContaNaLista(int numero) {
        for(Conta conta : contas){
            if(conta.getNumero() == numero){
                return conta;
            }
        }
        return null;
    }

    public void execListar(){
        //varrer a lista e mostrar o saldo de todas e o total geral
        double geral  = 0;
        System.out.println("Lista das contas: ");
        for(Conta conta : contas){
            geral += conta.exibirSaldo();
            System.out.println("------------------------------------------");
            System.out.println("Dados da conta, Numero: " + conta.getNumero());
            System.out.println("Saldo atual R$ " + conta.exibirSaldo());
            System.out.println("------------------------------------------");
        }
        System.out.println("Saldo Geral R$ " + geral);
    }
    public void execDepositar(){
        int numero;
        System.out.println("Digite o numero da conta: ");
        numero = Integer.parseInt(input.nextLine());
        Conta contaBuscada = buscarContaNaLista(numero);
        if(contaBuscada == null){
            System.out.println("Conta não foi encontrada");
        }else{
            double valor;
            System.out.println("Digite o valor do deposito: ");
            valor = Double.parseDouble(input.nextLine());
            contaBuscada.depositar(valor);
            System.out.println("Deposito efetuado com sucesso!");
        }
    }
    public void execSacar(){
        int numero;
        System.out.println("Digite o numero da conta: ");
        numero = Integer.parseInt(input.nextLine());
        Conta contaBuscada = buscarContaNaLista(numero);
        if(contaBuscada == null){
            System.out.println("Conta não foi encontrada");
        }else{
            double valor;
            System.out.println("Digite o valor do saque: ");
            valor = Double.parseDouble(input.nextLine());
            contaBuscada.sacar(valor);
        }
    }
}
