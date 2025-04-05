import java.util.Random;

public class ExemploMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        Random gerador = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = gerador.nextInt(10);
            }
        }
        //imprimir
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println(); //pular uma linha
        }
    }

}
