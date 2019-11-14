/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import Entity.Materia;
import Interfaces.MateriaFacadeLocal;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.ejb.EJBException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author jeiso
 */
@ManagedBean
@RequestScoped
public class Controlador {

    /**
     * Inyeccion del ejb para la tabla materia
     */
    @EJB
    MateriaFacadeLocal materiaBD;

    /**
     * Constructor de la clase
     */
    public Controlador() {
    }

    /**
     * Funcion encargada de capturar una excepcion personalizada con rollback
     */
    public void excepcionPersonalizadaR() {
        try {
            Materia o = new Materia("hacerRollbackpersonalizada");
            materiaBD.HacerRollBackPersonalizado(o);
        } catch (Exception e) {
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ocurrio un error " + e, null);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        }
    }

    /**
     * Funcion encargada de capturar una excepcion personalizada que no hace rollback
     */
    public void excepcionPersonalizadaNR() {
        try {
            Materia o = new Materia("no hacer rollback personalizada");
            materiaBD.NoHacerRollBackPersonalizado(o);
        } catch (Exception e) {
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ocurrio un error " + e, null);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        }
    }

    /**
     * Funcion encargada de capturar una excepcion del sistema con rollback
     */
    public void excepcionSistemaR() {
        try {
            Materia o = new Materia("hacer rollback sistema");
            materiaBD.HacerRollBackSistema(o);
        } catch (Exception e) {
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ocurrio un error " + e.getCause(), null);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        }
    }

    /**
     * Funcion encargada de capturar una excepcion personalizada que no hace rollback
     */
    public void excepcionSistemaNR() {
        try {
            Materia o = new Materia("no hacer rollback sistema");
            materiaBD.NoHacerRollBackSistema(o);
        } catch (Exception e) {
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ocurrio un error " + e.getCause(), null);
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        }
    }

}