import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExemploAluno {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno(67, "Maria");
        Aluno aluno2 = new Aluno(1, "Pedro");
        Aluno aluno3 = new Aluno(99, "Antonio");
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        //antes de ordenar
        System.out.println("Antes");
        for (Aluno aluno : alunos) {
            System.out.println("Matricula: " + aluno.getMatricula() + " " +
                    aluno.getNomeCompleto());
        }
        System.out.println("\nDepois");
        //depois de ordenar
        Collections.sort(alunos);
        for (Aluno aluno : alunos) {
            System.out.println("Matricula: " + aluno.getMatricula() + " " +
                    aluno.getNomeCompleto());
        }

        /*System.out.println("Tamanho da Lista: " + alunos.size());

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
        }*/

    }
}
