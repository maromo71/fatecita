public class Main {
    public static void main(String[] args) {
        String valor = "15";
        int quantidade = 2;
        int valorInt = Integer.parseInt(valor);
        double total = valorInt * quantidade;
        System.out.println("Total: " + total);
        String resultado = Double.toString(total);
        System.out.println("Resultado: " + resultado);
    }
}