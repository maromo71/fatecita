import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome do membro: ");
        membro.nome = input.nextLine();
        System.out.println("Digite a idade do membro: ");
        membro.idade = Integer.parseInt(input.nextLine());
        membro.imprimir(); //antes da logica da separacao
        membro.separarGrupo();
        membro.imprimir(); //depois da logica de separacao
    }
}
