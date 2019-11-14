/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.EstudianteMateria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jeiso
 */
@Local
public interface EstudianteMateriaFacadeLocal {

    void create(EstudianteMateria estudianteMateria);

    void edit(EstudianteMateria estudianteMateria);

    void remove(EstudianteMateria estudianteMateria);

    EstudianteMateria find(Object id);

    List<EstudianteMateria> findAll();

    List<EstudianteMateria> findRange(int[] range);

    int count();
    
}
