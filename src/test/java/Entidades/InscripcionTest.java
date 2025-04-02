package Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
class InscripcionTest  {

    @DisplayName("Test de aprobacion de inscripcion")
    @Test
    public void aprobado(){
        // Crear alumno
        Alumno yo = new Alumno("Bianca", "Castoldi", 12345);

        // Crear Materias
        Materia LyED = new Materia("Logica y Estructuras Discretas");
        Materia AyED = new Materia("Algoritmos y Estructura de Datos");
        Materia Pdp = new Materia("Paradigmas de Programacion");
        Materia IyS = new Materia("Ingenieria y Sociedad");

        // Crear correlativas
        Pdp.setCorrelativas(new HashSet<>(Arrays.asList(LyED, AyED)));

        // Agregar materias aprobada

        yo.agregarMateriaAprobada(LyED);
        yo.agregarMateriaAprobada(AyED);

        // Crear inscripcion

        Inscripcion primerCuatri2025 = new Inscripcion(yo, new HashSet<>(Arrays.asList(Pdp, IyS)));

        Assertions.assertTrue(primerCuatri2025.aprobada());

    }
  
}