public class Carro {
    private String marca;
    private String ano;
    private String modelo;
    private String placa;

    public Carro(String marca, String ano, String modelo, String placa) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", ano='" + ano + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }


}
