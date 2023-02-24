package entitats;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase para la generación de misiones, implementa la interficie
 * TesteableEntity.
 */
public class Missio implements interficies.TesteableEntity, Serializable {

    private int idMision;
    private String tituloMision;
    private String descripcion;
    private float recompensa;
    private Date fechaPublicacion;
    private boolean completada;
    private List<Aeronau> aeronaus;

    public Missio(int idMision, String tituloMision, String descripcion, float recompensa, Date fechaPublicacion, boolean completada, List<Aeronau> aeronaus) {
        this.idMision = idMision;
        this.tituloMision = tituloMision;
        this.descripcion = descripcion;
        this.recompensa = recompensa;
        this.fechaPublicacion = fechaPublicacion;
        this.completada = completada;
        this.aeronaus = aeronaus;
    }

    public int getIdMision() {
        return idMision;
    }

    public void setIdMision(int idMision) {
        this.idMision = idMision;
    }

    public String getTituloMision() {
        return tituloMision;
    }

    public void setTituloMision(String tituloMision) {
        this.tituloMision = tituloMision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(float recompensa) {
        this.recompensa = recompensa;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public List<Aeronau> getAeronaus() {
        return aeronaus;
    }

    public void setAeronaus(List<Aeronau> aeronaus) {
        this.aeronaus = aeronaus;
    }

    @Override
    public Integer getAtributIdentificador() {
        return idMision;
    }

    @Override
    public String getAtributString() {
        return tituloMision;
    }

    @Override
    public Float getAtributFloat() {
        return recompensa;
    }

    @Override
    public java.sql.Date getAtributDate() {
        return fechaPublicacion;
    }

    @Override
    public Boolean getAtributBoolean() {
        return completada;
    }

    @Override
    public void setAtributString(String s) {
        this.tituloMision = s;
    }

    @Override
    public void setAtributFloat(Float f) {
        this.recompensa = f;
    }

    @Override
    public void setAtributDate(java.sql.Date d) {
        this.fechaPublicacion = d;
    }

    @Override
    public void setAtributBoolean(Boolean b) {
        this.completada = b;
    }

}
