import java.util.Scanner;

public class AppExemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int a = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro valor inteiro: ");
        int b = Integer.parseInt(leitor.nextLine());
        //somar os dois valores
        int x = a + b;
        System.out.println("Resultado: " + x);
    }
}
