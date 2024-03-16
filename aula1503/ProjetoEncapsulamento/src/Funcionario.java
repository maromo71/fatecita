public class Funcionario {
    private int idFuncionario;
    private String nome;
    private String departamento;
    private double salario;

    public void atualizarSalario(double aumento){
        salario += aumento;
    }
    public void exibirDados(){
        System.out.println("idFuncionario = " + idFuncionario);
        System.out.println("nome = " + nome);
        System.out.println("departamento = " + departamento);
    }

    //modificadores de acesso gets e sets

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
