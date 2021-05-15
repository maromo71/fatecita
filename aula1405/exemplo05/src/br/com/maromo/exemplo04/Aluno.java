package br.com.maromo.exemplo04;

public class Aluno {
    //Atributos da classe
    int ra;
    String nome;
    int idade;
    String nomeTurma;
    String nomeCurso;

    //Comportamento - funcionalidade (métodos)
    void matricular() {
        System.out.println("Aluno de RA: " + ra + " foi matriculado");
        System.out.println("Avise o(a) " + nome + " para ");
        System.out.println("passar na tesouraria e pagar carteirinha");
    }

    void cancelarMatricula(){
        System.out.println("Aluno de RA: " + ra + " desistiu do curso");
        System.out.println("Passe na secretaria e pegue o comprovante");

    }

    void imprimirHistorico(){
        System.out.println("Dados do aluno matriculado...");
        System.out.println("Registro do aluno:  " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Frequenta o curso: " + nomeCurso);
        System.out.println("Na turma " + nomeTurma);
    }

}
