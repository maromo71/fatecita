package ui;

import model.Baralho;
import model.Carta;

public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.embaralhar();
        System.out.println(baralho);
        //Jogador 1 em posse da Carta1
        Carta carta1 = baralho.remover();

        //Jogador 2 em posse da Carta2
        Carta carta2 = baralho.remover();

        System.out.println("---------");
        System.out.println("Carta do Jogador 1: ");
        System.out.println(carta1);
        System.out.println("Carta do jogador 2: ");
        System.out.println(carta2);

        System.out.println(baralho);


    }

}
