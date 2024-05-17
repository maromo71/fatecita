package model;

import view.GerenciarAcessos;

import java.time.LocalDateTime;

public class Cliente implements Logavel {
    @Override
    public void login() {
        System.out.println("Cliente logou: " +
                LocalDateTime.now());
        GerenciarAcessos.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Cliente saiu do sistema: " +
                LocalDateTime.now());
        GerenciarAcessos.logados.add(this);
    }
}
