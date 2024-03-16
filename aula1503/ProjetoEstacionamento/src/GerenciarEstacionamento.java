public class GerenciarEstacionamento {
    public static void main(String[] args) {
        Cliente maromo = new Cliente("Marcos",
                "email@gmail.com", "19-9999-9999");
        System.out.println(maromo);
        Carro carro1 = new Carro("Citroen", "2013", "C3",
                "FFF-9090");
        Carro carro2 = new Carro("Hyundai", "2018", "Santa Fé",
                "FJO-2222");

        System.out.println("Maromo tem " + maromo.getCarros().size() + " carros");
        maromo.adicionarCarro(carro1);
        maromo.adicionarCarro(carro2);

        System.out.println(maromo);
        System.out.println("Maromo tem " + maromo.getCarros().size() + " carros");

    }
}
