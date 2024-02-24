public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 3;
        String texto = "10";
        int soma = ++x + ++y + ++z;
        System.out.println(soma);
        int valor = Integer.parseInt(texto);
        int soma2 = valor + x;
        System.out.println(soma2);
    }
}