import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                int a, b, c;
                System.out.println("Entre com o primeiro valor: ");
                a = Integer.parseInt(sc.nextLine());
                System.out.println("Entre com o segundo valor: ");
                b = Integer.parseInt(sc.nextLine());
                //operacao de divisao
                c = a / b;
                System.out.println("Resultado da divisao: " + c);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada de dado inválido");
            } catch (Exception e){
                System.out.println("Aconteceu um erro: " + e.getMessage());
            }

        }
    }
}
