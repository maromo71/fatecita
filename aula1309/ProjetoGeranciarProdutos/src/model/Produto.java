package model;

public class Produto {
    private int idProduto;
    private String nomeProduto;
    private boolean ativo;
    private double preco;
    private int qtdEstoque;
    private String principalFornecedor;

    public Produto(int idProduto, String nomeProduto, boolean ativo, double preco, int qtdEstoque, String principalFornecedor) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.ativo = ativo;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.principalFornecedor = principalFornecedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getPrincipalFornecedor() {
        return principalFornecedor;
    }

    public void setPrincipalFornecedor(String principalFornecedor) {
        this.principalFornecedor = principalFornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", ativo=" + ativo +
                ", preco=" + preco +
                ", qtdEstoque=" + qtdEstoque +
                ", principalFornecedor='" + principalFornecedor + '\'' +
                '}';
    }
}
