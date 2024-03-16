import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        int palpites[] = new int[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o palpite " + (i+1));
            palpites[i] = Integer.parseInt(sc.nextLine());
        }
        double resultado = tabuleiro.jogar(palpites);
        if(resultado > 0){
            System.out.println("Parabéns você venceu. Seu premio: " + resultado);
        }else{
            System.out.println("Infelizmente não foi dessa vez");
        }
    }
}
