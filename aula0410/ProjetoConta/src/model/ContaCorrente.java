package model;

public class ContaCorrente extends Conta {
    private double limiteEspecial;

    public ContaCorrente(int numero, String nomeCliente, double limiteEspecial) {
        super(numero, nomeCliente);
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= (getSaldo() + limiteEspecial)){
            setSaldo(getSaldo() - valor);
            cobrarTarifa();
            return true;
        }
        return false;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Limite Especial: " + limiteEspecial;
    }

    @Override
    void cobrarTarifa() {
        setSaldo(getSaldo() -1.0);
    }
}
