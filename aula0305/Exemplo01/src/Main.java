import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            int x = 10;
            int operando;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            operando = Integer.parseInt(sc.nextLine());
            int result = x / operando;
            System.out.println("Resultado: " + result);
        }catch (InputMismatchException | NumberFormatException ex){
            System.out.println("Dado deve ser inteiro");
        }catch (ArithmeticException ex){
            System.out.println("Não pode dividir por zero");
        }catch (Exception ex){
            System.out.println("Aconteu um erro: " + ex.getMessage());
            System.out.println("Entre em contato com administrador");
        }

    }
}