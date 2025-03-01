import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Media de dois valores entrados pelo usuario
        int a, b;
        double media;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo valor: ");
        b= Integer.parseInt(input.nextLine());
        media = (a + b) / 2.0;
        System.out.println("Media é: " + media);
    }
}