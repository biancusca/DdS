package Entidades;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
class MateriaTest {

    @Test
    @DisplayName("Test de cumpleCorrelativas")
    public void cumpleCorrelativas(){
        // Crear alumno
        Alumno yo = new Alumno("Bianca", "Castoldi", 12345);

        // Crear Materias
        Materia LyED = new Materia("Logica y Estructuras Discretas");
        Materia AyED = new Materia("Algoritmos y Estructura de Datos");
        Materia Pdp = new Materia("Paradigmas de Programacion");

        // Crear correlativas
        Pdp.setCorrelativas(new HashSet<>(Arrays.asList(LyED, AyED)));
        Pdp.setCorrelativas(new HashSet<>(Arrays.asList(LyED, AyED)));


        // Agregar materias aprobada

        yo.agregarMateriaAprobada(LyED);
        yo.agregarMateriaAprobada(AyED);

        assertTrue(Pdp.cumpleCorrelativas(yo));
    }
  
}