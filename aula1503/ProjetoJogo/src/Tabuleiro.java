public class Tabuleiro {
    private int[][] matriz = new int[8][8];
    private int[] palpites = new int[2];

    //Método para construir o tabuleiro
    public Tabuleiro(){
        for (int i = 0; i < 8; i++) { //linha
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = (int) (Math.random() * 80) + 1;
            }
        }
    }
    public double jogar(int[] palpites){
        this.palpites = palpites;
        int totalDeAcertos = procurar();
        imprimirTabuleiro();
        if(totalDeAcertos >= 3){
            return totalDeAcertos * 1000;
        }else{
            return 0.0;
        }

    }
    private int procurar(){
        int acertos = 0;
        for(int p = 0; p< 2; p++){ //palpite
            for (int i = 0; i < 8; i++) { //linha do tabuleiro
                for (int j = 0; j < 8; j++) { //coluna do tabuleiro
                    if(palpites[p] == matriz[i][j])acertos++;
                }
            }
        }
        return acertos;
    }
    private void imprimirTabuleiro(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(palpites[0] == matriz[i][j] || palpites[1] == matriz[i][j]){
                    System.out.printf("[%3d*]", matriz[i][j]);
                }else{
                    System.out.printf("[%3d ]", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
