public class Computador {
    //1. Atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    //2. Métodos
    public void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Cor = " + cor);
        System.out.println("Modelo = " + modelo);
        System.out.println("Número de Série = " + numeroSerie);
        System.out.println("Preço = " + preco);
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.3;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }
    }
    public boolean alterarValor(double valor){
        if(valor>0){
            preco = valor;
            return true;
        }
        return false;
    }
}
