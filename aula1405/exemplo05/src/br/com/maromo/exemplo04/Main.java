package br.com.maromo.exemplo04;

public class Main {

    public static void main(String[] args) {
	    //Matricular o Rafael - Claudemir
        Aluno alunoRafael, alunoClaudemir;
        alunoRafael = new Aluno();
        alunoClaudemir = new Aluno();

        alunoRafael.ra = 1001;
        alunoRafael.nome = "Rafael Aparecido C de Moraes";
        alunoRafael.idade = 22;
        alunoRafael.nomeTurma = "Segundo Período";
        alunoRafael.nomeCurso = "GTI";

        alunoClaudemir.ra = 2002;
        alunoClaudemir.nome = "Claudemir F Gallego";
        alunoClaudemir.idade = 23;
        alunoClaudemir.nomeTurma = "Segundo Período";
        alunoClaudemir.nomeCurso = "GTI";

        //Matricular o Rafael
        alunoRafael.matricular();
        System.out.println();
        //Matricular o Claudemir
        alunoClaudemir.matricular();

        System.out.println();
        //Cancelar a matricula do rafael
        alunoRafael.cancelarMatricula();

        System.out.println();
        //Imprimir o histórico do Claudemir
        alunoClaudemir.imprimirHistorico();



        }
}
