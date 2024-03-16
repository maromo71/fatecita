import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private List<Carro> carros = new ArrayList<>();

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", carros=" + carros +
                '}';
    }

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    public List<Carro> getCarros() {
        return carros;
    }
}
