import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaTeste {
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Listar Todos os Livros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    emprestarLivro();
                    break;
                case 3:
                    devolverLivro();
                    break;
                case 4:
                    listarLivros();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarLivro() {
        System.out.print("Informe o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Informe o autor do livro: ");
        String autor = scanner.nextLine();
        livros.add(new Livro(titulo, autor));
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void emprestarLivro() {
        System.out.print("Informe o título do livro para empréstimo: ");
        String titulo = scanner.nextLine();
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                livro.emprestar();
                System.out.println("Livro emprestado com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado ou já emprestado.");
    }

    private static void devolverLivro() {
        System.out.print("Informe o título do livro para devolução: ");
        String titulo = scanner.nextLine();
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    private static void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
