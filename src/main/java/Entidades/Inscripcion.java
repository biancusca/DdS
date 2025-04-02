package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Inscripcion {
    private Set<Materia> materiasACursar;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, Set<Materia> materiasACursar) {
        this.materiasACursar = materiasACursar;
        this.alumno = alumno;
    }

    public boolean aprobada(){
        for (Materia materia : materiasACursar) {
            if (!materia.cumpleCorrelativas(alumno)){
                System.out.println("La materia " + materia.getNombre() + " no cumple con las correlatividades.");
                return false;
            }
        }
        return true;
    }
}
