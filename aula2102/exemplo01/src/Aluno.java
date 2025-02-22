public class Aluno {
    // Definir atributos
    public long ra;
    public String nome;
    public String email;
    public double salario;

    //Definir os métodos
    public void matricular(){
        System.out.println("Aluno " + nome + " matriculado com sucesso!");
    }
    public void cancelarMatricular(){
        System.out.println("Aluno " + nome + " cancelada a matrícula !");
    }
}
