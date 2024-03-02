/**
 * @since mar 2024
 * @author Maromo
 * Classe Circulo. Possui o método calcular volume,
 * e o atributo raio
 */
public class Circulo {
    public double raio;

    /**
     * O Atributo raio, representa o valor do raio
     * o Calculo é feito pela formula
     * Volume = 4/3 * PI * raio ao cubo
     * @return o valor do volume da esfera
     */
    public double calcularVolume(){
        return 4.0/3 * Math.PI * Math.pow(raio, 3.0);
    }
}
