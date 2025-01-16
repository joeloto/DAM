package programacion.arrays;

import java.lang.reflect.Array;
import java.util.*;

public class act3apuntes {
    public static void main(String[] args) {
        String frase = "Jar-Jar is the Big Boss";

        // longitud de la cadena
        System.out.println("Longitud de la cadena: " + frase.length());

        // primer y último caracter
        System.out.println("Primer carácter de la cadena: " + frase.charAt(0));
        System.out.println("Último carácter de la cadena: " + frase.charAt(22));
        // System.out.println("Último carácter: " + frase.charAt(100)); No se puede
        // acceder al 100 porque está fuera de rango

        // cadena en mayúsculas, comparaciones con equals y equalsIgnoreCase
        System.out.println("Cadena en mayúsculas: " + frase.toUpperCase());
        System.out.println("Comparando con equals: " + frase.equals(frase.toUpperCase())); // imprime false
        System.out.println("Comparando con equalsIgnoreCase: " + frase.equalsIgnoreCase(frase.toUpperCase())); // imprime
                                                                                                               // true

        // cadena en minúsculas
        System.out.println("Cadena en minúsculas: " + frase.toLowerCase());

        // posición de la primera y la última vez que aparece la palabra “Jar”
        System.out.println("Posición de la primera y la última vez que aparece la palabra \"Jar\": "
                + frase.indexOf("Jar") + " y " + frase.lastIndexOf("Jar") + " respectivamente.");

        // crear una cadena a través de una posición de inicio y otra de final
        frase = frase.substring(7, 14);
        System.out.println("Cadena resultante: " + frase);

        // quitar los espacios de la cadena anterior
        System.out.println("Cadena anterior sin espacios extremos: " + frase.trim());

        // array de cadena separada por espacios y guiones
        frase = "Jar-Jar is the Big Boss";
        System.out.println("Cadena separada por espacios y guiones: (debajo)");
        frase.split(" - ");
        for (String frase2 : frase.split("-")){
            System.out.println(frase2);
        }

        //cada palabra 3 caracteres
        System.out.println("Cada palabra ocupa tres caracteres: " + frase.format(frase, "%.3s"));
        
    }
}
