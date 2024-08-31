public class Conta {
    //1, Atributos
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    //2. Métodos
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("Conta = " + conta);
        System.out.println("Agência = " + agencia);
        System.out.println("Saldo = " + saldo);
        System.out.println("Nome = " + nomeCliente);
    }
}
