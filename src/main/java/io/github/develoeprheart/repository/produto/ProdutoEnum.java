package io.github.develoeprheart.repository.produto;

public enum ProdutoEnum {
    ARMA(4, "arminha de fazer pei pei"),
    MUNICAO(3, "de colocar na arminha"),
    AGUA(2, "de beber"),
    COMIDA(1, "pq só vale 1??");

    private final Integer valor;
    private final String descrição;

    ProdutoEnum(Integer valor, String descricao) {
        this.valor = valor;
        this.descrição = descricao;
    }

    @Override
    public String toString() {
        return "ProdutoEnum{" +
                "valor=" + valor +
                ", descricao='" + descrição + '\'' +
                '}';
    }

    public Integer getValor() {
        return valor;
    }

    public String getDescrição() {
        return descrição;
    }
}
