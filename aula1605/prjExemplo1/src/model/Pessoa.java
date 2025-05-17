package model;

public class Pessoa implements Comparable<Pessoa> {
    private int idPessoa;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome) {
        this.idPessoa = idPessoa;
        this.nome = nome;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idPessoa == pessoa.idPessoa;
    }

    @Override
    public int hashCode() {
        //analogia das caixinhas explicada em aula
        return nome.length();
    }

    @Override
    public int compareTo(Pessoa o) {
        if(this.idPessoa < o.idPessoa) return -1;
        if(this.idPessoa > o.idPessoa) return 1;
        return 0;
    }
}
