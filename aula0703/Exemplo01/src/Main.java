import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean habilitado;
        int idade;
        System.out.println("Digite sua idade: ");
        idade = Integer.parseInt(input.nextLine());
        System.out.println("Digite true para habilitado ou false para não");
        habilitado = input.nextBoolean();
        if (idade >=18 && habilitado) {
            System.out.println("Pode pegar a caranga");
        }else{
            System.out.println("Infelizmente não pode dirigir");
        }
    }
}