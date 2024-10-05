package model;

public class Poupanca extends Conta{
    private int diaAniversario;

    public Poupanca(int numero, String nomeCliente, int diaAniversario) {
        super(numero, nomeCliente);
        this.diaAniversario = diaAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Dia Aniversario: " + diaAniversario;
    }

    @Override
    void cobrarTarifa() {
        setSaldo(getSaldo() - 0.50);
    }
}
