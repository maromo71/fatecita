package model;

public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe + "\n";
    }
}
