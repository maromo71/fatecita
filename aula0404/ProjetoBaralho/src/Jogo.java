public class Jogo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.mostrarBaralho();
        baralho.embaralhar();
        System.out.println();
        baralho.mostrarBaralho();
        Carta carta1 = baralho.cartas.get(0);
        Carta carta2 = baralho.cartas.get(1);
        Carta cMaior = baralho.maiorCarta(carta1, carta2);
        System.out.println("Maior carta das duas: " + cMaior);
    }
}
