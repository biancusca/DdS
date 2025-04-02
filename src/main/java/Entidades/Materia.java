package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>(); // sin correlativas por defecto
    }

    public boolean cumpleCorrelativas(Alumno alumno){
        if (alumno == null){
            System.out.println("No se ha ingresado ningun alumno");
            return false;
        }
        return alumno.getMateriasAprobadas().containsAll(correlativas);
    }
}
