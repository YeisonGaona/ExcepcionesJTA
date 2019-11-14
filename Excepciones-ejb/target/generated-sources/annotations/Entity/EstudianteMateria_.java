package Entity;

import Entity.Estudiante;
import Entity.Materia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-11T10:06:05")
@StaticMetamodel(EstudianteMateria.class)
public class EstudianteMateria_ { 

    public static volatile SingularAttribute<EstudianteMateria, Estudiante> estudiante;
    public static volatile SingularAttribute<EstudianteMateria, Materia> materia;
    public static volatile SingularAttribute<EstudianteMateria, Integer> id;
    public static volatile SingularAttribute<EstudianteMateria, String> nota;

}