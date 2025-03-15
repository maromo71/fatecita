import java.util.Scanner;

public class ContaTeste {
    //Atributo
    Conta cc = new Conta();

    public static void main(String[] args) {
        //input (objeto para entrada de dados)
        Scanner input = new Scanner(System.in);
        //teste (objeto para chamar os metodos execCadastrar...)
        ContaTeste teste = new ContaTeste();
        //variavel para controlar o laco
        int opcao = 0;
        do {
            //montar o menu
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("9. Sair");
            System.out.println("Escolha a opcao: ");
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execConsultar();
                    break;
                case 3:
                    teste.execDepositar();
                    break;
                case 4:
                    teste.execSacar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 9);
    }

    public void execCadastrar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do conta: ");
        cc.conta = input.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = input.nextLine();
        System.out.println("Digite a agencia da conta: ");
        cc.agencia = input.nextLine();
        System.out.println("Conta criada com sucesso!");
    }

    public void execConsultar() {
        cc.imprimir();
    }

    public void execSacar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(input.nextLine());
        if(cc.sacar(valor)==1){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Sem saldo suficiente para saque!");
        }
    }

    public void execDepositar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(input.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
    }
}
