public class Produto {
    public int codigo;
    public String descricao;
    public double valor;
    public int quantidade;

    public void entrada(int qtd){
        quantidade+= qtd;
    }
    public void saida(int qtd){
        quantidade-=qtd;
    }
}
