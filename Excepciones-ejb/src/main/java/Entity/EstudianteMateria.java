/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jeiso
 */
@Entity
@Table(name = "materia_estudiante")
public class EstudianteMateria {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "pk_estudiante")
    private Estudiante estudiante;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "pk_materia")
    private Materia materia;
    
    @Column(name="nota")
    private String nota;

    public EstudianteMateria() {
    }

    public EstudianteMateria(Estudiante estudiante, Materia materia, String nota) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

}
