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
        System.out.printf("%s", cadena);
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

    public static String pasoAMayusculas(int numeroCadenas) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        String cadenaFinal = "";
        for (int i = 0; i <= numeroCadenas; i++) {
            System.out.println("Escribe una cadena:");
            cadena = sc.nextLine();
        }

    }

    public static void main(String[] args) {
        String a = "jinetes de rohan";
        // muestraEnLinea(a);
        // System.out.println(subCadena(a, 2, 4));
        // muestraCentrado(a);
        // System.out.println(cadenaAVector(a));
        System.out.println(alReves(a));

    }
}

// subCadena(a, 2, 4) "nete"