public class Ordenacao {
    public static void main(String[] args) {
        int[] vetor = {3, 19, 1, 5, 45, 34, 56, 19, 21, 14};
        for(int i =0; i<10; i++){
            for(int j = i+1; j<10; j++){
                //comparar
                if(vetor[i] > vetor[j]){
                    int troca = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = troca;
                }
            }
        }
        for(int i =0; i<10; i++){
            System.out.println(vetor[i]);
        }
    }
}
