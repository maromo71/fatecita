import model.Carrinho;
import model.Produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciarProduto {
    public static void main(String[] args) {
        // Declara uma lista de produtos
        List<Produto> produtos = new ArrayList<>();

        // Instancia produtos e adiciona à lista
        Produto produto1 = new Produto(1, "Produto A", true, 100.0, 50, "Fornecedor X");
        Produto produto2 = new Produto(2, "Produto B", true, 200.0, 30, "Fornecedor Y");

        produtos.add(produto1);
        produtos.add(produto2);

        // Instancia um carrinho
        Carrinho carrinho = new Carrinho(1, new Date());

        // Adiciona produtos ao carrinho
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        // Invoca o método listarProdutos
        carrinho.listarProdutos();
    }
}
