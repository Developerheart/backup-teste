package io.github.develoeprheart.verbos.post.requestes;

import io.github.develoeprheart.repository.localizacao.Localizacao;
import lombok.Builder;

import java.io.Serializable;

@Builder
public class LocalizacaoRequest implements Serializable {

    public LocalizacaoRequest() {
    }

    private String nome;
    private Long latitude;
    private Long longitude;

    public LocalizacaoRequest(String nome, Long latitude, Long longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public LocalizacaoRequest(Localizacao localizacao){
        this.latitude = localizacao.getLatitude();
        this.longitude = localizacao.getLongitude();
        this.nome = localizacao.getNome();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
}
