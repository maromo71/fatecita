package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    //lista vazia
    private List<Carta> cartas = new ArrayList<>();

    public Baralho(){
        //montar a lista com 52 cartas
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta); //adicionei a carta
            }
        }
    }
    public void exibirCartas(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }

    public void embaralharCartas(){
        Collections.shuffle(cartas); //embaralhar
    }
}
