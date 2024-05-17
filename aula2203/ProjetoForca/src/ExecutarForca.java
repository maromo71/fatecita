import java.util.Scanner;

/**
 * Este código é uma implementação simples do jogo
 * "Forca" em Java. Ele utiliza a classe Scanner
 * para obter entrada do usuário e a classe
 * Forca para gerenciar o estado do jogo.
 * O loop do jogo continua até que o jogador
 * use todas as suas tentativas ou adivinhe a
 * palavra correta. Após o loop, ele verifica
 * se o jogador venceu ou perdeu o jogo e
 * imprime a mensagem apropriada.
 */
public class ExecutarForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Forca forca = new Forca();

        while (forca.getTentativasRestantes() > 0 && !forca.jogoTerminou()) {
            System.out.println("Palavra: " + forca.getEstadoPalavra());
            System.out.println("Tentativas restantes: " + forca.getTentativasRestantes());
            System.out.print("Escolha uma letra: ");
            String entrada = scanner.nextLine();
            if (entrada.length() == 1) {
                char letra = entrada.toUpperCase().charAt(0);
                forca.adivinharLetra(letra);
            } else {
                System.out.println("Por favor, insira apenas uma letra.");
            }
        }

        if (forca.jogadorVenceu()) {
            System.out.println("Parabéns! Você descobriu a palavra: " + forca.getEstadoPalavra());
        } else {
            System.out.println("Fim de jogo! As tentativas acabaram.");
        }
    }
}

