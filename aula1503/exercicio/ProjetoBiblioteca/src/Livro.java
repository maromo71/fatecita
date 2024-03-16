public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // Todos os livros são inicializados como disponíveis
    }

    // Métodos
    public void emprestar() {
        if(disponivel) {
            disponivel = false;
        } else {
            System.out.println("Livro não está disponível para empréstimo.");
        }
    }

    public void devolver() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Disponível: " + (disponivel ? "Sim" : "Não");
    }

    // Getters para acesso externo (se necessário)
    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}

