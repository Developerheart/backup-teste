package io.github.develoeprheart.repository.produto;

public class Arma {
    private Integer quantidade;
    private ProdutoEnum produtoEnum;

    public Arma(Integer quantidade, ProdutoEnum produtoEnum) {
        this.quantidade = quantidade;
        this.produtoEnum = produtoEnum;
    }



    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ProdutoEnum getProdutoEnum() {
        return produtoEnum;
    }

    public void setProdutoEnum(ProdutoEnum produtoEnum) {
        this.produtoEnum = produtoEnum;
    }

    @Override
    public String toString() {
        return "Agua{" +
                "quantidade=" + quantidade +
                ", produtoEnum=" + produtoEnum +
                '}';
    }
}
