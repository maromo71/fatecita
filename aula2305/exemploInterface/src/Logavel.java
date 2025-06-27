public interface Logavel {
    void efetuarLogin();

    void efetuarLogoff();

    default void loginComRegistro(){
        System.out.println("====================");
        efetuarLogin();
        GerenciarEmpresa.logados.add(this);
        System.out.println("foi adicionado na lista");
        System.out.println("====================");
    }
}
