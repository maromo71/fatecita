import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //apresentar numeros de um a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //regressiva de 10 até 1
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }
        //imprimir 10 valores aleatórios
        Random aleatorio = new Random();
        System.out.println("Aleatórios: ");
        for (int i = 1; i <= 10 ; i++) {
            //gerar valores entre 0 e 99
            int x = aleatorio.nextInt(100);
            System.out.println(x);
        }
        System.out.println("Acabou");
    }
}