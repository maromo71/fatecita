public class Acampamento {
    //1. Atributos
    public String nome;
    public char equipe;
    public int idade;

    //2. Métodos
    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }

    public void separarGrupo() {
        if(idade < 6){
            equipe = '-';
            return;
        }
        if(idade < 11){
            equipe = 'A';
            return;
        }
        if(idade < 21){
            equipe = 'B';
            return;
        }
        equipe = 'C';
    }
}
