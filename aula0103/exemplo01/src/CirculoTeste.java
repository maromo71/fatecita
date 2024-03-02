public class CirculoTeste {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.raio = 10;
        double resultado = circulo1.calcularVolume();
        System.out.println("Volume: " + resultado);
    }
}