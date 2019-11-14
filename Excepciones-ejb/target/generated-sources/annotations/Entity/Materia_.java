package Entity;

import Entity.EstudianteMateria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-11T10:06:05")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile ListAttribute<Materia, EstudianteMateria> materiaEstudiante;
    public static volatile SingularAttribute<Materia, Integer> id;
    public static volatile SingularAttribute<Materia, String> nombre;

}