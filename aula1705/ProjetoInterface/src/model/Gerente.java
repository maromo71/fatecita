package model;

import view.GerenciarAcessos;

import java.time.LocalDateTime;

public class Gerente extends Empregado implements Logavel{
    @Override
    public void login() {
        System.out.println("Gerente logou: " +
                LocalDateTime.now());
        GerenciarAcessos.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Gerente saiu do sistema: " +
                LocalDateTime.now());
        GerenciarAcessos.logados.add(this);
    }
}
