package model;

public class Carro {
    //Atributos privados
    private String marca;
    private String modelo;
    private String cor;
    private int anoFab;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    //toString
    @Override
    public String toString() {
        return "Dados do Carro \n" +
                "Modelo: " + modelo + "\n" +
                "Marca: " + marca + "\n" +
                "Cor: " + cor + "\n" +
                "Ano Fab: " + anoFab + "\n";
    }
}
