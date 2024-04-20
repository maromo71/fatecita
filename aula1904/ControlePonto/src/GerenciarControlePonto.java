import model.Gerente;
import model.Operador;
import model.RegistroPonto;
import model.Secretaria;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("Gerente Carlão");
        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Secretaria MAria");
        secretaria.setRamal("333");
        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setNome("Operador Joaquim");

        RegistroPonto registroDoCarlao = new RegistroPonto();
        registroDoCarlao.setIdRegPonto(1);
        registroDoCarlao.setFunc(gerente);
        System.out.println(registroDoCarlao.registrarEntrada());

        Thread.sleep(1000);

        RegistroPonto registroDaMaria = new RegistroPonto();
        registroDaMaria.setIdRegPonto(2);
        registroDaMaria.setFunc(secretaria);
        System.out.println(registroDaMaria.registrarEntrada());

        Thread.sleep(1000);

        RegistroPonto registroDoJoaquim = new RegistroPonto();
        registroDoJoaquim.setIdRegPonto(3);
        registroDoJoaquim.setFunc(operador);
        System.out.println(registroDoJoaquim.registrarEntrada());

        Thread.sleep(1000);
        System.out.println(registroDoJoaquim.registarSaida());

        Thread.sleep(1000);
        System.out.println(registroDaMaria.registarSaida());

        Thread.sleep(1000);
        System.out.println(registroDoCarlao.registarSaida());

    }
}