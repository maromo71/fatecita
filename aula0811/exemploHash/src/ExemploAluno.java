import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploAluno {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        Aluno aluno1 = new Aluno(11, "Maria");
        Aluno aluno2 = new Aluno(22, "Pedro");
        Aluno aluno3 = new Aluno(33, "Antonio");

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println("Tamanho da Lista: " + alunos.size());

        Scanner sc = new Scanner(System.in);
        Aluno alunoProc = new Aluno();
        System.out.println("Digite a matricula a ser encontrada: ");
        alunoProc.setMatricula(Integer.parseInt(sc.nextLine()));
        if(alunos.contains(alunoProc)) {
            System.out.println("Aluno Encontrado!");
            int indice = alunos.indexOf(alunoProc);
            alunoProc = alunos.get(indice);
            System.out.println("Nome do(a) aluno(a): " + alunoProc.getNomeCompleto());
        }else{
            System.out.println("Aluno não encontrado!");
        }

    }
}
