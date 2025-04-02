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
        Alumno otro = new Alumno("Juan", "Perez", 67890);
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

        Inscripcion bcastoldiPrimerCuatri2025 = new Inscripcion(yo, new HashSet<>(Arrays.asList(Pdp, IyS)));
        Inscripcion jperezPrimerCuatri2025 = new Inscripcion(otro, new HashSet<>(Arrays.asList(IyS, Pdp)));

        Assertions.assertTrue(bcastoldiPrimerCuatri2025.aprobada());
        Assertions.assertFalse(jperezPrimerCuatri2025.aprobada());

    }
  
}