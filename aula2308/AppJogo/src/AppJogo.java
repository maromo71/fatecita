import java.util.Scanner;

/**
 * @author Marcos (Maromo)
 * @since agosto 2024
 * Jogo da Advinhação
 */
public class AppJogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int magico, palpite;
        //numero aleatorio entre 1 e 1000
        magico = (int) (Math.random() * 1000) + 1;
        int cont = 0;
        do {
            System.out.println("Digite o palpite " + (cont + 1) + " entre [1..1000]:");
            palpite = Integer.parseInt(leitor.nextLine());
            cont++; //cont soma 1
            //verificando se acertou
            if (palpite == magico) {
                System.out.println("Parabéns... Você ganhou");
                return; //terminar o programa
            } else {
                if (palpite > magico) {
                    System.out.println("Seu palpite foi alto");
                } else {
                    System.out.println("Seu palpite foi baixo");
                }
            }
            if(cont == 10){
                System.out.println("A banca venceu.... PUTZ -- O numero: " + magico);
                return; //terminar
            }
        }while(true);
    }
}
