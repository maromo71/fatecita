import java.util.Scanner;

public class AcampamentoTeste {
    //2. método main
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do escoteiro: ");
        membro.nome = scanner.nextLine();
        System.out.println("Digite a idade do escoteiro");
        membro.idade = Integer.parseInt(scanner.nextLine());
        membro.imprimir();
        membro.separarGrupo();
        System.out.println(); //pular linha
        membro.imprimir();
    }
}
