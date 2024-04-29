package ejercicioscajanegra.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static String generarCualidadSegunCasaHarryPotter() {
        Scanner teclado = new Scanner(System.in);
        String casa = teclado.nextLine().toLowerCase();
        switch (casa) {
            case "gryffindor" -> {
                return "valentía";
            }
            case "hufflepuff" -> {
                return "lealtad";
            }
            case "slytherin" -> {
                return "astucia";
            }
            case "ravenclaw" -> {
                return "intelecto";
            }
            default -> {
                return "no es una casa válida";
            }
        }
    }

}
