import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valor = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor");
            valor[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(valor[i] + " ");
        }
    }


}
