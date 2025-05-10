import model.Caixa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Caixa caixa = new Caixa();
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o valor do deposito: ");
            double valor = Double.parseDouble(leitor.nextLine());
            //agora eu quero depositar este valor
            caixa.depositar(valor);
            System.out.println("Saldo: " + caixa.getSaldo());
            System.out.println("Digite o valor para o saque: ");
            valor = Double.parseDouble(leitor.nextLine());
            caixa.sacar(valor);
            System.out.println("Saldo: " + caixa.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
