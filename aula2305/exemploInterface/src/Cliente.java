public class Cliente implements Logavel {

    @Override
    public void efetuarLogin() {
        System.out.println("Cliente logou");
        GerenciarEmpresa.logados.add(this);
    }

    @Override
    public void efetuarLogoff() {
        System.out.println("Cliente saiu do sistema");
        GerenciarEmpresa.logados.remove(this);
    }
}
