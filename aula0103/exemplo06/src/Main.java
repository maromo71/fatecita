import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exemplo do while
        // Criar uma soma até que seja maior que 100
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        while(soma <= 100){
            System.out.println("Digite um valor: ");
            int n = Integer.parseInt(leitor.nextLine());
            soma += n;
        }
        //fora do while
        System.out.println("Resultado da soma: " + soma);
    }
}