import java.util.Scanner;

public class AppExemplo03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double volume, raio;
        System.out.println("Digite o valor do raio: ");
        //Ler um dado do tipo double
        raio = leitor.nextDouble();
        //Biblioteca Matemática (Math)
        //Math.PI (Constante PI)
        //Math.pow (base elevado ao expoente)
        volume = 4/3.0 * Math.PI * Math.pow(raio, 3.0);
        System.out.println("Volume da esfera: " + volume);

    }
}
