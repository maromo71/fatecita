import java.util.Scanner;

public class GerenciarLoja {
    public static void main(String[] args) {
        //Criar um cliente com dados vindo do teclado
        //1 criar um objeto do tipo cliente
        Cliente cliente1 = new Cliente();

        //2 criar o objeto para ler (classe Scanner)
        Scanner scanner = new Scanner(System.in);

        //3 pedir os dados
        System.out.println("Digite o código do cliente: ");
        cliente1.codigo = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nome do cliente: ");
        cliente1.nome = scanner.nextLine();
        System.out.println("Digite a idade do cliente: ");
        cliente1.idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o email do cliente: ");
        cliente1.email = scanner.nextLine();

        //4 mostrar os dados do cliente
        cliente1.exibirDados();

    }
}