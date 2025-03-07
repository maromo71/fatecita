import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1  - Pizza Quatro Queijos");
            System.out.println("2  - Pizza Calabresa");
            System.out.println("3  - Pizza Mussarela");
            System.out.println("Escolha sua opcao: ");
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Pizza Quatro Queijos = R$ 49,00");
                    break;
                case 2:
                    System.out.println("Pizza Calabresa = R$ 51,00");
                    break;
                case 3:
                    System.out.println("Pizza Mussarela = R$ 52,00");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao < 1 || opcao > 3);

    }
}
