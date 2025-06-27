public class Gerente extends Funcionario implements Logavel{
    private double salario;

    @Override
    public void efetuarLogin() {
        System.out.println("Gerente logou");

    }

    @Override
    public void efetuarLogoff() {
        System.out.println("Gerente saiu do sistema");
        GerenciarEmpresa.logados.remove(this);
    }
}
