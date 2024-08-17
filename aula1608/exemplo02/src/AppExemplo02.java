import java.util.Scanner;

public class AppExemplo02 {
    public static void main(String[] args) {
        //leitor é variável objeto para leitura de dados
        //do teclado.
        Scanner leitor = new Scanner(System.in);
        int x, y;
        //exibir a mensagem na tela
        System.out.println("Digite o valor de x: ");
        //x recebe o numero inteiro digitado pelo usuario
        x = leitor.nextInt();
        System.out.println("Digite o valor de y: ");
        //y recebe o numero inteiro digitado pelo usuario
        y = leitor.nextInt();
        //soma recebe o valor de x acrescido ao valor de y
        int soma = x + y;
        //exibe o resultado na tela
        System.out.println("Resultado: " + soma);
        System.out.println();
    }
}
