public class MatrizIdentidade {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        //gerar a matriz identidade
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(i == j){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        //imprimir
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println(); //pular uma linha
        }
    }
}
