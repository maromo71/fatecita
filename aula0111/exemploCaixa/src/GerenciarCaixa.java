import model.Caixa;
import utils.CaixaException;

import java.util.Scanner;

public class GerenciarCaixa {
    private Caixa caixa = new Caixa();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarCaixa gc = new GerenciarCaixa();
        int opcao = 0;
        do{
            try {
                System.out.println("Menu de Opções");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Exibir Saldo");
                System.out.println("9. Sair");
                System.out.println("Digite sua opção: ");
                opcao = Integer.parseInt(sc.nextLine());
                switch (opcao) {
                    case 1:
                        gc.execDepositar();
                        break;
                    case 2:
                        gc.execSacar();
                        break;
                    case 3:
                        gc.execSaldo();
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }catch (NumberFormatException e){
                System.out.println("Entrada de dados inválida.");
            }catch(Exception e){
                System.out.println("Aconteceu o erro: " + e.getMessage());
            }
        }while(opcao != 9);
    }

    private void execSaldo() {
        System.out.println("Saldo atual R$ " + caixa.getSaldo());
    }

    private void execSacar() throws CaixaException {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        valor = Double.parseDouble(sc.nextLine());
        caixa.sacar(valor);
        System.out.println("Saque efetuado com sucesso!");
    }

    private void execDepositar() throws CaixaException {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        valor = Double.parseDouble(sc.nextLine());
        caixa.depositar(valor);
        System.out.println("Depósito efetuado com sucesso!");
    }
}
