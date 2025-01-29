package programacion.arrays.boletin;

import java.util.*;

public class ejercicio4 {

    public static void muestraEnLinea(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    public static String subCadena(String cadena, int posicionInicio, int numCaracteres) {
        String cadenaDefinitiva = "";
        for (int i = posicionInicio; i < posicionInicio + numCaracteres; i++) {
            cadenaDefinitiva += cadena.charAt(i);
        }
        if (cadena == null || numCaracteres > cadena.length()) {
            return "";
        }
        return cadenaDefinitiva;
    }

    public static void muestraCentrado(String cadena) {
        int consola = 80;
        int espacios = (consola - cadena.length())/2;
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print(cadena);
    }

    public static char[] cadenaAVector(String cadena) {
        char[] vector = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            vector[i] = cadena.charAt(i);
        }
        return vector;
    }

    public static String alReves(String cadena) {
        String reves = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reves = reves + cadena.charAt(i);
        }
        return reves;
    }

    public static String pasoAMayusculas(String... numeroCadenas) {
        String cadenas = "";
        String cadena2 = "";
        for (int i = 0; i < numeroCadenas.length; i++) {
            cadenas += numeroCadenas[i];
            for (int j = 0; j < cadenas.length(); j++) {
                if (cadenas.charAt(j) >= 'a' && cadenas.charAt(j) <= 'z') {
                    cadena2 += (char) (cadenas.charAt(j) - 32);
                }
                if (cadenas.charAt(j) == '_') {
                    cadena2 += " ";
                }
            }
        }
        return cadena2;
    }

    public static void main(String[] args) {
        String a = "jinetes de rohan";

        // System.out.println( (char)(a.charAt(0)+10) );

        String b = pasoAMayusculas("bla_de", "runner");
        // muestraEnLinea(a);
        // System.out.println(subCadena(a, 2, 4));
        muestraCentrado(a);
        // System.out.println(cadenaAVector(a));
        // System.out.println(alReves(a));
        // System.out.println(b);

    }
}

// subCadena(a, 2, 4) "nete"