public class Exemplo {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(11, "Maria");
        Aluno aluno2 = new Aluno(22, "Pedro");
        Aluno aluno3 = new Aluno(33, "Antonio");

        System.out.println("Hashcode do aluno1 = " + aluno1.hashCode());
        System.out.println("Hashcode do aluno2 = " + aluno2.hashCode());
        System.out.println("Hashcode do aluno3 = " + aluno3.hashCode());

        Aluno alunoProc = new Aluno();
        alunoProc.setMatricula(33);

        if(alunoProc.equals(aluno3)){
            System.out.println("Aluno encontrado");
        }else{
            System.out.println("Não trata-se do mesmo aluno");
        }
    }
}
