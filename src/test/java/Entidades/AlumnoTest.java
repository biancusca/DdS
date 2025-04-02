package Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
class AlumnoTest {

    @Test
    @DisplayName("Test agregar materia aprobada")

    public void agregarMateriaAprobada() {
        // Crear alumno
        Alumno yo = new Alumno("Bianca", "Castoldi", 12345);

        // Crear materia
        Materia IyS = new Materia("Ingenieria y Sociedad");

        // Agregar materia aprobada

        yo.agregarMateriaAprobada(IyS);

        // Verificar que la materia haya sido agregada

        assertTrue(yo.getMateriasAprobadas().contains(IyS));
    }
  
}