public class Aluno {
    //1. Definir os atributos
    public int ra;
    public String nome;
    public String turma;

    //2. Definir os métodos
    public void matricular(){
        System.out.println("Aluno " + nome + " foi matriculado com sucesso");
    }
    public void trancarMatricula(){
        System.out.println("Aluno " + nome + " trancou a matrícula");
    }
    public void exibirDados(){
        System.out.println("Dados do Aluno: ");
        System.out.println("ra = " + ra);
        System.out.println("nome = " + nome);
        System.out.println("turma = " + turma);
    }
}
