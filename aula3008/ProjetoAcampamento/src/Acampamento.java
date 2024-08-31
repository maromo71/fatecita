public class Acampamento {
    //1. Atributos
    public String nome;
    public char equipe;
    public int idade;

    //2. Métodos
    public void imprimir(){
        System.out.println("Nome = " + nome);
        System.out.println("Equipe = " + equipe);
        System.out.println("Idade = " + idade);
    }
    public void separarGrupo(){
        if(idade < 6){
            equipe = '-';
            return;
        }
        if(idade <= 10){
            equipe = 'A';
            return;
        }
        if(idade <= 20){
            equipe = 'B';
            return;
        }
        equipe = 'C';
    }
}
