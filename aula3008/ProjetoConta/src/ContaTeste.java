import java.util.Scanner;

public class ContaTeste {
    //1. Atributo
    public Conta cc = new Conta();

    //2, Métodos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //objeto para usar a ContaTeste
        ContaTeste teste = new ContaTeste();
        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar Conta");
            System.out.println("2.. Consultar Conta");
            System.out.println("3.. Depositar na Conta");
            System.out.println("4.. Sacar da Conta");
            System.out.println("9.. Finalizar Programa");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
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
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){

    }
    public void execConsultar(){

    }
    public void execSacar(){

    }
    public void execDepositar(){

    }
}
