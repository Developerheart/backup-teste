package io.github.develoeprheart.repository.localizacao;

import io.github.develoeprheart.verbos.post.requestes.LocalizacaoRequest;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "localizacoes")
public class Localizacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id", unique=true, nullable = false)
    private UUID id;
    private String nome;
    private Long latitude;
    private Long longitude;


    public Localizacao(UUID id, String nome, Long latitude, Long longitude) {
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Localizacao(String nome, Long latitude, Long longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public Localizacao(LocalizacaoRequest localizacaoRequest)  {
        this.nome = localizacaoRequest.getNome();
        this.latitude = localizacaoRequest.getLatitude();
        this.longitude = localizacaoRequest.getLongitude();

    }

    public Localizacao() {

    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Localizacao that = (Localizacao) o;
        return id.equals(that.id) && nome.equals(that.nome) && latitude.equals(that.latitude) && longitude.equals(that.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, latitude, longitude);
    }

    @Override
    public String toString() {
        return "Localizacao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
