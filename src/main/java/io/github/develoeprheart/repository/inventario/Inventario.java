package io.github.develoeprheart.repository.inventario;

import io.github.develoeprheart.repository.rebelde.Rebelde;
import io.github.develoeprheart.verbos.post.requestes.InventoryRequest;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "inventario")
public class Inventario implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id")
    private UUID id;


    private Integer agua;

    private Integer municao;

    private Integer comida;

    private Integer arma;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Rebelde rebelde;





    public Rebelde getRebelde() {
        return rebelde;
    }

    public void setRebelde(Rebelde rebelde) {
        this.rebelde = rebelde;
    }

    public Inventario() {
    }
    public Inventario(InventoryRequest inventoryRequest){
        this.agua = inventoryRequest.getAgua();
        this.comida = inventoryRequest.getComida();
        this.municao = inventoryRequest.getMunicao();
        this.arma = inventoryRequest.getArma();
    }

    public Inventario(Integer agua, Integer municao, Integer comida, Integer arma) {
        this.agua = agua;
        this.municao = municao;
        this.comida = comida;
        this.arma = arma;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getAgua() {
        return agua;
    }

    public void setAgua(Integer agua) {
        this.agua = agua;
    }

    public Integer getMunicao() {
        return municao;
    }

    public void setMunicao(Integer municao) {
        this.municao = municao;
    }

    public Integer getComida() {
        return comida;
    }

    public void setComida(Integer comida) {
        this.comida = comida;
    }

    public Integer getArma() {
        return arma;
    }

    public void setArma(Integer arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id=" + id +
                ", agua=" + agua +
                ", municao=" + municao +
                ", comida=" + comida +
                ", arma=" + arma +
                '}';
    }
}
