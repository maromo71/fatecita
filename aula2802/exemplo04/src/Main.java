public class Main {
    public static void main(String[] args) {
        int idade = 20;

        if (idade <= 5) {
            System.out.println("Não tem categoria para aula");
        } else if (idade <= 10) {
            System.out.println("Categoria A");
        } else if (idade <= 17) {
            System.out.println("Categoria B");
        } else {
            System.out.println("Categoria C");
        }
    }
}

