package model;

public class Aluno {
    private int ra;
    private String nome;
    private String email;
    private String telefone;
    private String turma;
    private String login;
    private String senha;
    private MesMatricula mesMatricula;

    //método construtor padrão.
    public Aluno(){

    }

    public Aluno(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Aluno(int ra, String nome, String email, String telefone, String turma, String login, String senha) {
        this(login, senha);
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.turma = turma;

    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public MesMatricula getMesMatricula() {
        return mesMatricula;
    }

    public void setMesMatricula(MesMatricula mesMatricula) {
        this.mesMatricula = mesMatricula;
    }
}
