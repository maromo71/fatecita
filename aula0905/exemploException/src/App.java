import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try{
            Scanner leitor = new Scanner(System.in);
            int a, b;
            System.out.println("Digite o valor de a: ");
            a = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite o valor de b: ");
            b = leitor.nextInt();
            int resultado = a / b;
            System.out.println("Resultado da divisao: " + resultado);
        }catch (NumberFormatException | InputMismatchException e){
            System.out.println("Erro: Entrada Inválida. Valor inteiro");
        }catch(ArithmeticException e){
            System.out.println("Erro: Impossivel dividir por ZERO");
        }catch(Exception e){
            System.out.println("Aconteceu um erro inesperado");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Tchau");
        }
    }
}
