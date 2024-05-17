import java.util.List;
import java.util.Random;


public class Forca {
    private List<String> palavras = List.of("MURO", "TECLADO", "JAVA", "PROGRAMACAO", "MONITOR");
    private String palavraSecreta;
    private char[] estadoPalavra;
    private int tentativasRestantes;

    public Forca() {
        Random random = new Random();
        this.palavraSecreta = palavras.get(random.nextInt(palavras.size()));
        this.estadoPalavra = new char[palavraSecreta.length()];
        for (int i = 0; i < this.estadoPalavra.length; i++) {
            this.estadoPalavra[i] = '_';
        }
        this.tentativasRestantes = 7;
    }

    /**
     * Este trecho de código define um método chamado adivinharLetra que recebe um parâmetro do tipo char chamado letra e retorna um valor do tipo boolean.
     * Dentro do método, ele inicializa uma variável acertou como false. Em seguida, ele itera sobre cada caractere na string palavraSecreta usando um loop for. Se um caractere na string palavraSecreta for igual ao parâmetro letra, ele atualiza o índice correspondente no array estadoPalavra com o valor da letra e define acertou como true.
     * Se nenhum caractere na string palavraSecreta corresponder ao parâmetro letra, ele decrementa a variável tentativasRestantes.
     * Por fim, o método retorna o valor de acertou, que indica se a letra foi adivinhada corretamente ou não.
     *
     */
    public boolean adivinharLetra(char letra) {
        boolean acertou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                estadoPalavra[i] = letra;
                acertou = true;
            }
        }
        if (!acertou) {
            tentativasRestantes--;
        }
        return acertou;
    }

    public String getEstadoPalavra() {
        return new String(estadoPalavra);
    }

    public int getTentativasRestantes() {
        return tentativasRestantes;
    }

    public boolean jogoTerminou() {
        for (char c : estadoPalavra) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public boolean jogadorVenceu() {
        return jogoTerminou() && tentativasRestantes > 0;
    }
}

