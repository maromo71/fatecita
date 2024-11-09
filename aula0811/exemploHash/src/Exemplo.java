public class Exemplo {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(56, "Maria");
        Aluno aluno2 = new Aluno(11, "Pedro");
        Aluno aluno3 = new Aluno(99, "Antonio");

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
