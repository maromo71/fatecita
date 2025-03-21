import java.util.Random;

public class Exemplo {
    public static void main(String[] args) {
        int[] vetor = new int[10]; //10 posições
        Random gerador = new Random(); //gerar aleatorios
        //preencher com 10 dados aleatorios
        for (int i = 0; i < 10; i++) {
            vetor[i] = gerador.nextInt(21);
            System.out.println("Posicao " + i + ": " + vetor[i]);
        }
        //Encontrar o maior valor e a posicao que ele se encontra
        int maior = vetor[0];
        int posicaoMaior = 0;
        for(int i = 1; i< 10; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posicaoMaior = i;
            }
        }
        System.out.println("Posicao do maior: " + posicaoMaior);
        System.out.println("Elemento maior: " + maior);
    }
}
