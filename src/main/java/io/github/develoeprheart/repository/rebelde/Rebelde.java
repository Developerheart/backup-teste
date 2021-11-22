package io.github.develoeprheart.repository.rebelde;

import io.github.develoeprheart.repository.inventario.Inventario;
import io.github.develoeprheart.repository.localizacao.Localizacao;
import lombok.Builder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "rebelde")
@Builder
public class Rebelde implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private UUID id;


    public void setId(UUID id) {
        this.id = id;
    }

    private String nome;
    private Integer idade;
    private Character genero;

    @OneToOne(mappedBy = "rebelde",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Localizacao localizacao;

    @OneToOne( mappedBy = "rebelde", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Inventario inventario;


    public Rebelde(UUID id, String nome, Integer idade, Character genero, Localizacao localizacao, Inventario inventario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;
        this.inventario = inventario;
    }

    public Rebelde(String nome, Integer idade, Character genero, Localizacao localizacao, Inventario inventario) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;
        this.inventario = inventario;
    }

    public Rebelde() {

    }

    public UUID getId() {
        return id;
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

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        localizacao.setRebelde(this);
        this.localizacao = localizacao;
    }


    public void novaLocalizacao(Localizacao localizacao){
        this.localizacao = new Localizacao();
        this.localizacao.setId(localizacao.getId());
        this.localizacao.setNome(localizacao.getNome());
        this.localizacao.setLongitude(localizacao.getLongitude());
        this.localizacao.setLatitude(localizacao.getLatitude());

    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        inventario.setRebelde(this);
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Rebelde{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
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
        Rebelde rebelde = (Rebelde) o;
        return Objects.equals(id, rebelde.id) && Objects.equals(nome, rebelde.nome) && Objects.equals(idade, rebelde.idade) && Objects.equals(genero, rebelde.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idade, genero);
    }

    public Rebelde(UUID id, String nome, Integer idade, Character genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }
}
