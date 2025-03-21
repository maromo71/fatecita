import java.util.Random;

public class Exemplo {
    public static void main(String[] args) {
        int[] vetor = new int[10]; //10 posições
        Random gerador = new Random(); //gerar aleatorios
        //preencher com 10 dados aleatorios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(21);
            System.out.println("Posicao " + i + ": " + vetor[i]);
        }
        //Encontrar o maior valor e a posicao que ele se encontra
        int maior = vetor[0];
        int menor = vetor[0];
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        for(int i = 1; i< vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posicaoMaior = i;
            }
            if(vetor[i] < menor){
                menor = vetor[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Posicao do maior: " + posicaoMaior);
        System.out.println("Elemento maior: " + maior);
        System.out.println("Posicao do menor: " + posicaoMenor);
        System.out.println("Elemento menor: " + menor);
    }
}
