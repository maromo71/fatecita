public class Teste {
    public static void main(String[] args) {
        DiaSemana diaAcademia = DiaSemana.quinta;

        System.out.println("Dia de academia: " + diaAcademia);

        for(DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
