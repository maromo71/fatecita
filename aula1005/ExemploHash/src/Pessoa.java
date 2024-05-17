import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private int id;
    private String nome;

    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        return  ((o instanceof Pessoa) &&  ((Pessoa)o).id == this.id);
    }

    @Override
    public int hashCode() {
        //criar um algoritmo que represente uma lógica
        //de agrupamento
        return nome.length();
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Nome da Pessoa: " + nome + "\n";
    }

    @Override
    public int compareTo(Pessoa o) {
        if(this.id < o.id) return -1;
        if(this.id > o.id) return 1;
        return 0;
    }
}
