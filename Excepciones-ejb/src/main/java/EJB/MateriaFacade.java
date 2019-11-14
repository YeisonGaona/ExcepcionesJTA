/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Estudiante;
import Interfaces.AbstractFacade;
import Interfaces.MateriaFacadeLocal;
import Entity.Materia;
import Excepciones.ExcepcionEdad;
import Excepciones.ExcepcionNombre;
import Excepciones.Excepciongenerica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ApplicationException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jeiso
 */
@Stateless
public class MateriaFacade extends AbstractFacade<Materia> implements MateriaFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Excepciones-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MateriaFacade() {
        super(Materia.class);
    }

    @Override
    public void HacerRollBackSistema(Materia m) {
        em.persist(m);
        Estudiante e = null;
        e.getEstudianteMateria();
    }

    @Override
    public void NoHacerRollBackSistema(Materia m) throws IOException{
        em.persist(m);
        throw new IOException("Error de archivo");
    }

    @Override
    public void HacerRollBackPersonalizado(Materia m) throws ExcepcionNombre {
        em.persist(m);
        throw new ExcepcionNombre("Su nombre es demasiado largo");
    }

    @Override
    public void NoHacerRollBackPersonalizado(Materia m) throws ExcepcionEdad {
        em.persist(m);
        throw new ExcepcionEdad("Tu edad es incorrecta");

    }

}
