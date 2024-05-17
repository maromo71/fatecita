import java.util.Arrays;

public class ExemploVetor {
    public static void main(String[] args) {
        int vetor[] = new int[50];
        Arrays.fill(vetor, 15);
        for (int i = 0; i < 50; i++) {
            System.out.println(vetor[i]);
        }

    }
}
