public class Computador {
    //atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    //métodos
    public void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Cor = " + cor);
        System.out.println("Numero de Serie = " + numeroSerie);
        System.out.println("Preco = " + preco);
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }
    }
    public int alterarValor(double valor){
        if(valor <= 0){
            return 0;
        }
        preco = valor;
        return 1;
    }
}
