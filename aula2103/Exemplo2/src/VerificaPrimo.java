public class VerificaPrimo {
    public static void main(String[] args) {
        int[] primos = new int[100];
        int numero = 2;
        int contador = 0; //conta numeros primos
        do{
           boolean ehPrimo = true;
           for(int i =2; i<=numero/2; i++){
               if(numero%i==0){
                   ehPrimo = false;
                   break;
               }
           }
           if(ehPrimo){
               primos[contador] = numero;
               contador++;
           }
           numero++;
        }while(contador < 100);
        for (int i = 0; i < 100; i++) {
            System.out.println("Posicao: " + i + " Num. Primo: " + primos[i]);
        }
    }
}
