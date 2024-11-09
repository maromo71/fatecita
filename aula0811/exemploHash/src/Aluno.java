import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private int matricula;
    private String nomeCompleto;

    public Aluno(){

    }

    public Aluno(int matricula, String nomeCompleto) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        //logica das caixas (numero caraceteres do nome da pessoa)
        return nomeCompleto.length();
    }

    @Override
    public int compareTo(Aluno o) {
        return Integer.compare(matricula, o.matricula);
    }
}
