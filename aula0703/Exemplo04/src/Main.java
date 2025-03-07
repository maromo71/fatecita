import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int valor;

        while(soma < 500){
            System.out.println("Digite um valor: ");
            valor = Integer.parseInt(input.nextLine());
            if(valor < 0) break;
            soma += valor;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Pronto");
    }
}