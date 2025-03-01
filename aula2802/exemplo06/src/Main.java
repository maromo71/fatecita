import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 1000;
        int num;
        //enqto soma < 100 pede um valor e soma
       // while(soma < 100){
       //     System.out.println("Digite um valor: ");
      //      num = input.nextInt();
      //   soma += num;
       // }

        do{
            System.out.println("Digite um valor: ");
            num = input.nextInt();
            soma += num;
        }while(soma<100);

        System.out.println("Soma final: " + soma);
    }
}