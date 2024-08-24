public class AppExemplo01 {

    public static void main(String[] args) {
        //comentario de uma linha
        int a = 1, b = 3, c = 4;
        /*
         comentario de mais de uma linha
         bla bla bla
         ladl asdkl l
         sadasdas
         */
        int x = ++a + ++b + ++c; //(agrega 1 antes)
        System.out.println(x); // 11
        System.out.println(a); // 2
        System.out.println(b); // 4
        System.out.println(c); // 5

        System.out.println(somar(5, 3));
        int valor1 = 5;
        int valor2 = 2;
        double resultado = valor1 / (double) valor2;
        System.out.println("Resultado: "    + resultado);
        System.out.println(Short.MAX_VALUE);


    }

    /**
     *
     * @param a Primeiro valor da soma
     * @param b Segundo valor da soma
     * @return soma os dois valores enviados na funcão e retorna o resultado
     */
    public static int somar(int a, int b) {
        return a + b;
    }
}
