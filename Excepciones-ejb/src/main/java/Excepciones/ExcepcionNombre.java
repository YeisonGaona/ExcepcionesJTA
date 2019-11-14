/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import javax.ejb.ApplicationException;

/**
 *
 * @author jeiso
 */
@ApplicationException(rollback = true)
public class ExcepcionNombre extends ClassNotFoundException {

    public ExcepcionNombre(String s) {
        super(s);
    }
    
}
