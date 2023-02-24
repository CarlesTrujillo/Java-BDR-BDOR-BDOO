package entitats;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author FPShare
 */
public class Mecanic extends Soldat implements interficies.TesteableEntity, Serializable{

    private String claveMecanico;
    private float versionHerramientas;
    private int navesReparadas;

    public Mecanic(String claveMecanico, float versionHerramientas, int navesReparadas, int idSoldado, int edad, String nombreClave, float versionTransmisor, Date fechaAlistamiento, boolean operativo) {
        super(idSoldado, edad, nombreClave, versionTransmisor, fechaAlistamiento, operativo);
        this.claveMecanico = claveMecanico;
        this.versionHerramientas = versionHerramientas;
        this.navesReparadas = navesReparadas;
    }

    public String getClaveMecanico() {
        return claveMecanico;
    }

    public void setClaveMecanico(String claveMecanico) {
        this.claveMecanico = claveMecanico;
    }

    public float getVersionHerramientas() {
        return versionHerramientas;
    }

    public void setVersionHerramientas(float versionHerramientas) {
        this.versionHerramientas = versionHerramientas;
    }

    public int getNavesReparadas() {
        return navesReparadas;
    }

    public void setNavesReparadas(int navesReparadas) {
        this.navesReparadas = navesReparadas;
    }

    @Override
    public Integer getAtributIdentificador() {
        return idSoldado;
    }

    @Override
    public String getAtributString() {
        return nombreClave;
    }

    @Override
    public Float getAtributFloat() {
        return versionHerramientas;
    }

    @Override
    public Date getAtributDate() {
        return fechaAlistamiento;
    }

    @Override
    public Boolean getAtributBoolean() {
        return operativo;
    }

    @Override
    public void setAtributString(String s) {
        this.nombreClave = s;
    }

    @Override
    public void setAtributFloat(Float f) {
        this.versionHerramientas = f;
    }

    @Override
    public void setAtributDate(Date d) {
        this.fechaAlistamiento = d;
    }

    @Override
    public void setAtributBoolean(Boolean b) {
        this.operativo = b;
    }

}
