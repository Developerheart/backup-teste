package io.github.develoeprheart.verbos.post.responses;

import io.github.develoeprheart.verbos.post.requestes.InventoryRequest;
import io.github.develoeprheart.verbos.post.requestes.LocalizacaoRequest;
import lombok.Builder;

import java.util.UUID;

@Builder
public class RebeldeResponse {

    private UUID id;
    private String nome;
    private Integer idade;
    private Character genero;

    private LocalizacaoRequest localizacao;
    private InventoryRequest inventario;





    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public RebeldeResponse() {
    }

    public RebeldeResponse(UUID id, String nome, Integer idade, Character genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public RebeldeResponse(UUID id, String nome, Integer idade, Character genero, LocalizacaoRequest localizacao, InventoryRequest inventario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;
        this.inventario = inventario;
    }
}
