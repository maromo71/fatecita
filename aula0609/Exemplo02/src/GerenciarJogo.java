import model.MegaSena;

public class GerenciarJogo {

    public static void main(String[] args) {
        MegaSena jogo = new MegaSena();
        jogo.exibirVolante();
        System.out.println();
        jogo.gerarCartela();
    }
}
