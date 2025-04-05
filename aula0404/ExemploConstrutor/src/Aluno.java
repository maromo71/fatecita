public class Aluno {
    private int ra;
    private String nome;
    private String login;
    private String senha;

    //Métodos construtores
    //Construtor padrão
    public Aluno(){

    }
    //Método construtor sobrecarregado
    public Aluno(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    //Mais um método construtor
    public Aluno(int ra, String nome, String login, String senha){
        this(login, senha);
        this.ra = ra;
        this.nome = nome;

    }
    public void imprimir(){
        System.out.println("Dados do aluno: ");
        System.out.println("ra = " + ra);
        System.out.println("nome = " + nome);
        System.out.println("login = " + login);
    }
}
