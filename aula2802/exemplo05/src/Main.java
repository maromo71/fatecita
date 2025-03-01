import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pedido;
        System.out.println("Digite um pedido de 1 a 3: ");
        pedido = Integer.parseInt(input.nextLine());
        switch(pedido){
            case 1:
                System.out.println("Batata Frita");
                break;
            case 2:
                System.out.println("Refri");
                break;
            case 3:
                System.out.println("Cerveja");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        //contagem de 0 a 9
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}