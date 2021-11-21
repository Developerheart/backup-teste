package io.github.develoeprheart.verbos.post.requestes;

import io.github.develoeprheart.repository.inventario.Inventario;
import lombok.Builder;

import java.io.Serializable;
import java.util.Objects;

@Builder
public class InventoryRequest implements Serializable {

    private Integer arma;
    private Integer municao;
    private Integer agua;
    private Integer comida;


    public InventoryRequest() {
    }

    public InventoryRequest(Inventario inventario) {

        this.agua = inventario.getAgua();
        this.arma = inventario.getArma();
        this.comida = inventario.getComida();
        this.municao = inventario.getMunicao();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryRequest that = (InventoryRequest) o;
        return Objects.equals(arma, that.arma) && Objects.equals(municao, that.municao) && Objects.equals(agua, that.agua) && Objects.equals(comida, that.comida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arma, municao, agua, comida);
    }

    public Integer getArma() {
        return arma;
    }

    public void setArma(Integer arma) {
        this.arma = arma;
    }

    public Integer getMunicao() {
        return municao;
    }

    public void setMunicao(Integer municao) {
        this.municao = municao;
    }

    public Integer getAgua() {
        return agua;
    }

    public void setAgua(Integer agua) {
        this.agua = agua;
    }

    public Integer getComida() {
        return comida;
    }

    public void setComida(Integer comida) {
        this.comida = comida;
    }

    public InventoryRequest(Integer arma, Integer municao, Integer agua, Integer comida) {
        this.arma = arma;
        this.municao = municao;
        this.agua = agua;
        this.comida = comida;
    }
}
