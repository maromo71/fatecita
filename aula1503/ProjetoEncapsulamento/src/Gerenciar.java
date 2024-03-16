public class Gerenciar {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setIdFuncionario(1);
        funcionario.setNome("Maria");
        funcionario.setDepartamento("Financeiro");
        funcionario.setSalario(5000);
        funcionario.exibirDados();
    }
}
