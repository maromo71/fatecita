import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        int magico, palpite;
        magico = aleatorio.nextInt(1000) + 1;
        int cont = 0;
        while(true){
            cont++;
            if(cont > 10){
                System.out.println("Suas chances terminaram");
                System.out.println("O numero era: " + magico);
                break;
            }
            System.out.println("Digite o seu palpite  " + cont);
            palpite = Integer.parseInt(input.nextLine());

            if(magico == palpite){
                System.out.println("Parabéns ganhou R$ 5000");
                break;
            }else{
                System.out.println("Infelizmente errou");
                if(magico > palpite){
                    System.out.println("Palpite baixo");
                }else{
                    System.out.println("Palpite alto");
                }
            }
        }

    }
}