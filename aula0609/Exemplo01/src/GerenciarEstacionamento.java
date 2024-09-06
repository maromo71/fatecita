import model.Carro;
import model.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Pulse");
        carro.setMarca("Fiat");
        carro.setCor("Prata");
        carro.setAnoFab(2023);

        Carro carro2 = new Carro();
        carro2.setModelo("Santa Fé");
        carro2.setMarca("Hyundai");
        carro2.setCor("Branca");
        carro2.setAnoFab(2015);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maromo");
        pessoa.setDataAbertura(LocalDate.now());
        pessoa.setId(1);

        //Vamos adicionar os dois carro a pessoa Maromo
        pessoa.adicionarCarro(carro);
        pessoa.adicionarCarro(carro2);

        //Mostrar os dados da pessoa
        System.out.println("Imprimindo --> ");
        System.out.println(pessoa);

        System.out.println();
        //Mostrar dados dos carros da pessoa Maromo
        System.out.println("Imprimindo os carros -->");
        System.out.println(pessoa.getCarrosDaPessoa());
    }
}
