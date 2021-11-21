package io.github.develoeprheart.repository.denuncia;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "denuncias")
public class Denuncia implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private UUID idDenuncia;
    private UUID idCagueta;
    private UUID idSuspeito;
    private String motivo;


    public Denuncia(UUID idCagueta, UUID idSuspeito, String motivo) {
        this.idCagueta = idCagueta;
        this.idSuspeito = idSuspeito;
        this.motivo = motivo;
    }

    public Denuncia() {
    }

    public Denuncia(UUID idDenuncia, UUID idCagueta, UUID idSuspeito, String motivo) {
        this.idDenuncia = idDenuncia;
        this.idCagueta = idCagueta;
        this.idSuspeito = idSuspeito;
        this.motivo = motivo;
    }

    public UUID getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(UUID idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public UUID getIdCagueta() {
        return idCagueta;
    }

    public void setIdCagueta(UUID idCagueta) {
        this.idCagueta = idCagueta;
    }

    public UUID getIdSuspeito() {
        return idSuspeito;
    }

    public void setIdSuspeito(UUID idSuspeito) {
        this.idSuspeito = idSuspeito;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
