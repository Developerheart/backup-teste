package io.github.develoeprheart.verbos.post.requestes;


import lombok.Builder;

import java.io.Serializable;
import java.util.Objects;

@Builder
public class RebeldeRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private Integer idade;
    private Character genero;

    private LocalizacaoRequest localizacao;

    private InventoryRequest inventario;



    public RebeldeRequest(String nome, Integer idade, Character genero, LocalizacaoRequest localizacao, InventoryRequest inventario) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "RebeldeRequest{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero=" + genero +
                ", localizacao=" + localizacao +
                ", inventario=" + inventario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RebeldeRequest that = (RebeldeRequest) o;
        return Objects.equals(nome, that.nome) && Objects.equals(idade, that.idade) && Objects.equals(genero, that.genero) && Objects.equals(localizacao, that.localizacao) && Objects.equals(inventario, that.inventario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, genero, localizacao, inventario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public LocalizacaoRequest getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(LocalizacaoRequest localizacao) {
        this.localizacao = localizacao;
    }

    public InventoryRequest getInventario() {
        return inventario;
    }

    public void setInventario(InventoryRequest inventario) {
        this.inventario = inventario;
    }
}
