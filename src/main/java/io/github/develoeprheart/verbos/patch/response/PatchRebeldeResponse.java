package io.github.develoeprheart.verbos.patch.response;

import io.github.develoeprheart.repository.inventario.Inventario;
import io.github.develoeprheart.repository.localizacao.Localizacao;
import io.github.develoeprheart.verbos.post.requestes.InventoryRequest;
import io.github.develoeprheart.verbos.post.requestes.LocalizacaoRequest;
import lombok.Builder;

import java.io.Serializable;
import java.util.UUID;

@Builder
public class PatchRebeldeResponse  implements Serializable {

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

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = new LocalizacaoRequest();
        this.localizacao.setLatitude(localizacao.getLatitude());
        this.localizacao.setLongitude(localizacao.getLongitude());
        this.localizacao.setNome(localizacao.getNome());
    }

    public InventoryRequest getInventario() {
        return inventario;
    }

    public void setInventario(InventoryRequest inventario) {
        this.inventario = inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = new InventoryRequest();
        this.inventario.setAgua(inventario.getAgua());
        this.inventario.setArma(inventario.getArma());
        this.inventario.setComida(inventario.getComida());
        this.inventario.setMunicao(inventario.getMunicao());
    }


    public PatchRebeldeResponse() {
    }

    public PatchRebeldeResponse(UUID id, String nome, Integer idade, Character genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public PatchRebeldeResponse(UUID id, String nome, Integer idade, Character genero, LocalizacaoRequest localizacao, InventoryRequest inventario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;
        this.inventario = inventario;
    }
}
