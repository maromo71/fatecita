package model;

import java.util.Date;
import java.util.List;

public class Carrinho {
    private int idCarrinho;
    private Date dataMovimento;
    private List<Produto> itens;

    // Construtor
    public Carrinho(int idCarrinho, Date dataMovimento) {
        this.idCarrinho = idCarrinho;
        this.dataMovimento = dataMovimento;
        this.itens = new ArrayList<>();
    }

    // Adicionar produtos ao carrinho
    public void adicionarProduto(Produto produto) {
        this.itens.add(produto);
    }

    // Listar produtos
    public void listarProdutos() {
        for (Produto produto : itens) {
            System.out.println(produto);
        }
    }

}
