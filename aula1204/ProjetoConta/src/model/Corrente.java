package model;

public class Corrente extends Conta {
    private double limiteEspecial;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= (limiteEspecial + getSaldo())){
            setSaldo(getSaldo() - valor);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite Especial R$ " + limiteEspecial + "\n";
    }
}
