public class Conta {
    private int numConta;
    private String nomeCliente;
    private double saldo;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if(valor > saldo){
            return false;
        }
        saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "Dados da Conta \n" +
                "Num: " + numConta + "\n" +
                "Cliente: " + nomeCliente + "\n"+
                "Saldo R$ " + saldo + "\n";
    }
}
