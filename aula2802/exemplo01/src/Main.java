public class Main {
    public static void main(String[] args) {
        int x = 2, y = 3, z = 4;

        int soma = x++ + ++y + ++z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(soma);
    }
}