package io.github.develoeprheart.verbos.patch.request;


import io.github.develoeprheart.repository.localizacao.Localizacao;
import lombok.Builder;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Builder
public class PatchRebeldeRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String nome;
    private Integer idade;
    private Character genero;

    private LocalizacaoRequest localizacao;


    public PatchRebeldeRequest() {
    }

    public PatchRebeldeRequest(String nome, Integer idade, Character genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public PatchRebeldeRequest(String nome, Integer idade, Character genero, LocalizacaoRequest localizacao) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;

    }

    @Override
    public String toString() {
        return "RebeldeRequest{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero=" + genero +
//                ", localizacao=" + localizacao +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatchRebeldeRequest that = (PatchRebeldeRequest) o;
        return Objects.equals(nome, that.nome) && Objects.equals(idade, that.idade) && Objects.equals(genero, that.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, genero);
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

    public Localizacao localizacao(UUID id){
        return new Localizacao(id, this.localizacao.getNome(), this.localizacao.getLatitude(), localizacao.getLongitude());


    }

    public void setLocalizacao(LocalizacaoRequest localizacao) {
        this.localizacao = localizacao;
    }

}
