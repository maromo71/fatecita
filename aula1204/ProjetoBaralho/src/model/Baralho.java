package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    List<Carta> cartas = new ArrayList<>();

    public Baralho(){
        //Criar o nosso baralho
        montarBaralho();

    }

    private void montarBaralho(){
        //Montagem do Baralho
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta carta = new Carta();
                carta.setValor(valor);
                carta.setNaipe(naipe);
                cartas.add(carta);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Baralho\n");
        for(Carta carta : cartas){
            sb.append(carta);
        }
        return sb.toString();
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta remover(){
        Carta cartaRemovida = cartas.get(0);
        cartas.remove(cartaRemovida);
        return cartaRemovida;
    }
}
