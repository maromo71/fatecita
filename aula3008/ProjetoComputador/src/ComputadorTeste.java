import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.modelo = "Novo";
        computador1.cor = "Branca";
        computador1.numeroSerie = 123456;
        computador1.preco = 3500.00;
        //imprimir
        computador1.imprimir();
        //invocar o método calcularValor
        computador1.calcularValor();
        computador1.imprimir(); //Segunda impressão
        //Computador 2
        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Velho";
        computador2.cor = "Branca";
        computador2.numeroSerie = 34567;
        computador2.preco = 2000.0;
        computador2.imprimir(); //Primeira impressão
        computador2.calcularValor(); //50% a mais no preço
        computador2.imprimir(); //Segunda impressão
        //Leitor da classe Scanner
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o novo valor do computador: ");
        //recebo um texto com o valor e converto para tipo double
        double valor = Double.parseDouble(leitor.nextLine());
        if(computador2.alterarValor(valor)){
            System.out.println("Preço alterado com sucesso");
        }else{
            System.out.println("Preço deve ser positivo");
        }

        computador2.imprimir(); //Terceira impressão.
    }
}
