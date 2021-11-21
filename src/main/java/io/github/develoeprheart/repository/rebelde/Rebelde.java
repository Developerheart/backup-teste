package io.github.develoeprheart.repository.rebelde;

import io.github.develoeprheart.repository.inventario.Inventario;
import io.github.develoeprheart.repository.localizacao.Localizacao;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "rebeldes")
public class Rebelde implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id", unique=true, nullable = false)
    private UUID id;

    public void setId(UUID id) {
        this.id = id;
    }

    private String nome;
    private Integer idade;
    private Character genero;
//    @OneToOne(targetEntity = Localizacao.class, cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
    @OneToOne(targetEntity = Localizacao.class,  cascade = CascadeType.ALL)
    private Localizacao localizacao;

    @OneToOne(targetEntity = Inventario.class, cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private Inventario inventario;



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
        this.localizacao = localizacao;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
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
