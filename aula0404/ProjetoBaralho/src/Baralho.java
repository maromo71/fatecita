import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    List<Carta> cartas = new ArrayList<>();

    public Baralho(){
        //Criar logica de montar o baralho
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta novaCarta = new Carta(naipe, valor);
                cartas.add(novaCarta);
            }
        }
    }
    public void mostrarBaralho(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }
    public Carta maiorCarta(Carta x, Carta y){
        if(x.getValor().ordinal() > y.getValor().ordinal()){
            return x;
        } else if (x.getValor().ordinal() == y.getValor().ordinal()) {
            if (x.getNaipe().ordinal() < y.getNaipe().ordinal()) {
                return x;
            }
        }
        return y;
    }
}
