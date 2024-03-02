import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = leitor.nextLine().toLowerCase();
        char letraConvertida = letra.charAt(0);
        switch (letraConvertida){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("é vogal");
                break;
            default:
                System.out.println("nao é vogal");
        }

    }
}