/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Materia;
import Excepciones.ExcepcionEdad;
import Excepciones.ExcepcionNombre;
import Excepciones.Excepciongenerica;
import java.io.IOException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jeiso
 */
@Local
public interface MateriaFacadeLocal {

    void create(Materia materia);

    void edit(Materia materia);

    void remove(Materia materia);

    Materia find(Object id);

    List<Materia> findAll();

    List<Materia> findRange(int[] range);

    int count();
    
    public void HacerRollBackSistema(Materia m);

    public void NoHacerRollBackPersonalizado(Materia m) throws ExcepcionEdad;

    public void HacerRollBackPersonalizado(Materia m) throws ExcepcionNombre;

    public void NoHacerRollBackSistema(Materia m)throws IOException;
    
    
}
