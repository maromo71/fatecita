package view;


import model.Aluno;
import model.MesMatricula;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1, aluno2, aluno3;
        aluno1 = new Aluno();
        aluno2 = new Aluno("maromo", "123");
        aluno3 = new Aluno(123,
                "Maria",
                "maria@gmail.com",
                "19-9999-9999",
                "DSM",
                "maria",
                "234");
        aluno3.setMesMatricula(MesMatricula.setembro);
        

    }
}
