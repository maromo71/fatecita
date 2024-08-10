public class Main {
    public static void main(String[] args) {
        Produto coca = new Produto();
        coca.codigo = 1;
        coca.descricao = "Coca cola";
        coca.valor = 4.89;

        //Entrada de 100 cocas
        coca.entrada(100);
        //Saida de 10 cocas
        coca.saida(10);

        System.out.println("Saldo");
        System.out.println(coca.quantidade);
    }
}