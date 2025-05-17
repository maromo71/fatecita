import model.Pessoa;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(5, "Maria");
        Pessoa p2 = new Pessoa(3, "Antonio");
        Pessoa p3 = new Pessoa(1, "Zecao Barbosa");
        Pessoa p4 = new Pessoa(2, "Zeze");
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        Collections.sort(pessoas);
        for(Pessoa p : pessoas) {
            System.out.println("Id da pessoa: " + p.getIdPessoa());
            System.out.println("Nome: " + p.getNome());
        }
/*
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        System.out.println(p1.equals(p3)); */
    }
}
