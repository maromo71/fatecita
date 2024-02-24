public class GerenciarEscola {
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno();
       aluno1.ra = 111;
       aluno1.nome = "Ana";
       aluno1.turma = "DSM";

       Aluno aluno2 = new Aluno();
       aluno2.ra = 222;
       aluno2.nome = "José";
       aluno2.turma = "GE";

       aluno2.exibirDados();
       aluno1.matricular();
       aluno2.matricular();
       aluno2.trancarMatricula();
    }
}