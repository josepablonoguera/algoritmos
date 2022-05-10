/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.sql.Date;

/**
 *
 * @author Pablo
 */
public class NodoPersona {
    
    //Informacion del Nodo
    private String cedula;
    private String nombreCompleto;
    private Date fechaNacimiento;
    private boolean genero;
    
    //El puntero
    public NodoPersona sig ;    
    
  

    public NodoPersona(String cedula, String nombreCompleto, Date fechaNacimiento, boolean genero) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.sig = null;
    }

    public NodoPersona() {
        this.cedula = "No registrada";
        this.nombreCompleto = "No registrado";
        this.fechaNacimiento = null;
        this.genero = false;
        this.sig = null;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the genero
     */
    public boolean isGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(boolean genero) {
        this.genero = genero;
    }

     
    
    
}
