package model;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;

public class MegaSena {
    //Definir atributos
    private int[][] tabuleiro = new int[6][10];
    private int[] cartela = new int[6];

    //Definindo o método construtor
    public MegaSena(){
        //logica para gerar o tabuleiro de  1 a 60
        int cont = 1;
        for (int i = 0; i < 6; i++) { //linha
            for (int j = 0; j < 10; j++) {
                tabuleiro[i][j] = cont++;
            }
        }
    }

    public void exibirVolante(){
        for (int i = 0; i < 6; i++) { //linha
            for (int j = 0; j < 10; j++) { //coluna
                System.out.printf("[%2d] ", tabuleiro[i][j]); //valor
            }
            System.out.println();
        }
    }
    public void gerarCartela(){
        SecureRandom numeros = new SecureRandom();

        for (int i = 0; i < 6; i++) {
            cartela[i] = numeros.nextInt(1, 61);
        }
        //exibir a cartela gerada
        Arrays.sort(cartela); //ordenar
        System.out.println("JOGUE OS NÚMEROS DA SORTE: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("[%2d] ", cartela[i]);
        }
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}

