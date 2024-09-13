package model;

public class Funcionario {
    private String nome;
    private String departamento;
    private String rg;
    private double salario;
    private boolean ativo;

    //construtor personalizado
    public Funcionario(){
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void bonificar(double valor){
        salario += valor; //acrescer valor ao salário
    }

    public String listar(){
        return "Dados do Funcionário \n" +
                "Nome: " + nome + "\n" +
                "Departamento: " + departamento + "\n" +
                "RG: " + rg + "\n" +
                "Salário: " + salario + "\n" +
                "Ativo: " + (ativo ? "Sim" : "Não") + "\n";
    }
}
