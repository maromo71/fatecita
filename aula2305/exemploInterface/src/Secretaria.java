public class Secretaria extends Funcionario implements Logavel {

    private double salario;


    @Override
    public void efetuarLogin() {
        //Login da secretaria
        System.out.println("Secretaria logou");
        GerenciarEmpresa.logados.add(this);
    }

    @Override
    public void efetuarLogoff() {
        //Logica do logoff
        System.out.println("Secretaria saiu do sistema");
        GerenciarEmpresa.logados.remove(this);
    }
}
