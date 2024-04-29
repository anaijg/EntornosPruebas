package ejercicioscajanegra.ejercicio2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Caso de prueba: #1")
    void generarCualidadSegunCasaHarryPotter1() {

// Simular la entrada estándar System.in
        String input = "GRYFFINDOR";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("valentía", Ejercicio2.generarCualidadSegunCasaHarryPotter());
    }

    @Test
    @DisplayName("Caso de prueba: #2")
    void generarCualidadSegunCasaHarryPotter2() {

// Simular la entrada estándar System.in
        String input = "HUFFLEPUFF";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("lealtad", Ejercicio2.generarCualidadSegunCasaHarryPotter());
    }

    @Test
    @DisplayName("Caso de prueba: #3")
    void generarCualidadSegunCasaHarryPotter3() {

// Simular la entrada estándar System.in
        String input = "slytherin";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("astucia", Ejercicio2.generarCualidadSegunCasaHarryPotter());
    }

    @Test
    @DisplayName("Caso de prueba: #4")
    void generarCualidadSegunCasaHarryPotter4() {

// Simular la entrada estándar System.in
        String input = "ravenclaw";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("intelecto", Ejercicio2.generarCualidadSegunCasaHarryPotter());
    }

    @Test
    @DisplayName("Caso de prueba: #5")
    void generarCualidadSegunCasaHarryPotter5() {

// Simular la entrada estándar System.in
        String input = "cuchicuchi";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("no es una casa válida", Ejercicio2.generarCualidadSegunCasaHarryPotter());
    }


}