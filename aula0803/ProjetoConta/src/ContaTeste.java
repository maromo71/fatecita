import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTeste teste = new ContaTeste();
        int opcao = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            switch(opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execDepositar();
                    break;
                case 3:
                    teste.execSacar();
                    break;
                case 4:
                    teste.execConsultar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        cc.conta = scanner.nextLine();
        System.out.println("Digite o nome da agência: ");
        cc.agencia = scanner.nextLine();
        System.out.println("Digite o nome da cliente: ");
        cc.nomeCliente = scanner.nextLine();
        System.out.println("Conta cadastrada com sucesso");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        double valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        valor = Double.parseDouble(scanner.nextLine());
        boolean sacou = cc.sacar(valor);
        if(sacou){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente para o saque");
        }

    }
    public void execDepositar(){
        double valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        valor = Double.parseDouble(scanner.nextLine());
        cc.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }
}
