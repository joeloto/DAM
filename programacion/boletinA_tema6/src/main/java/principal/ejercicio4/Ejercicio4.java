package principal.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    /**
     * muestra cada letra de una cadena en una linea distinta
     * @param cadena recoge la cadena de la que se extraen las letras
     */
    public static void muestraEnLinea(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    /**
     * replica del substring
     * @param cadena recoge la cadena que se quiere utilizar
     * @param posicionInicio recoge la posicion de inicio de la cadena desde donde se quiere empezar
     * @param numCaracteres recoge el numero de caracteres que se quieren coger
     * @return devuelve la cadena resultante o una cadena vacia si no se cumple el if
     */
    public static String subCadena(String cadena, int posicionInicio, int numCaracteres) {
        String cadenaDefinitiva = "";
        if (cadena == null || numCaracteres > cadena.length() - posicionInicio || posicionInicio > cadena.length() || numCaracteres >= 0 || posicionInicio < 0) {
            throw new IllegalArgumentException("Cadena parámetros incorrectos");
        }
        for (int i = posicionInicio; i < posicionInicio + numCaracteres; i++) {
            cadenaDefinitiva += cadena.charAt(i);
        }
        
        return cadenaDefinitiva;
    }

    /**
     * centra una cadena en la consola
     * @param cadena recoge la cadena que se quiere centrar
     */
    public static void muestraCentrado(String cadena) {
        int consola = 80;
        if (cadena.length() > 80) {
            throw new IllegalArgumentException("La cadena supera el límite");
        }
        int espacios = (consola - cadena.length())/2;
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print(cadena);
    }

    /**
     * elabora un vector de char con una cadena
     * @param cadena recoge la cadena de la que se extraen los char
     * @return devuelve el vector
     */
    public static char[] cadenaAVector(String cadena) {
        char[] vector = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            vector[i] = cadena.charAt(i);
        }
        return vector;
    }

    /**
     * imprime una cadena al reves
     * @param cadena recoge la cadena que se quiere poner al reves
     * @return devuelve la cadena al reves
     */
    public static String alReves(String cadena) {
        String reves = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reves = reves + cadena.charAt(i);
        }
        return reves;
    }

    /**
     * une las cadenas y las pone en mayusculas y si hay _ lo sustituye or un guion bajo
     * @param numeroCadenas recoge las cadenas (numero indeterminado)
     * @return devuelve la cadena resultante
     */
    public static String pasoAMayusculas(String... numeroCadenas) {
        String cadenas = "";
        String cadena2 = "";
        for (int i = 0; i < numeroCadenas.length; i++) {
            cadenas = numeroCadenas[i];
            for (int j = 0; j < cadenas.length(); j++) {
                if (cadenas.charAt(j) >= 'a' && cadenas.charAt(j) <= 'z') {
                    cadena2 += (char) (cadenas.charAt(j) - 32);
                }
                else if (cadenas.charAt(j) == '_') {
                    cadena2 += " ";
                } else {
                    cadena2 += cadenas.charAt(j);
                }
            }
        }
        return cadena2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        muestraCentrado("");
        System.out.println();
        boolean error;
       
        do {                                                        
            error = false;
            try {
                System.out.println("Dime la posición de inicio");
                int inicio = sc.nextInt();
                System.out.println("Dime la posición final");
                int end = sc.nextInt();
                subCadena("sjsj", inicio, end);
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Variables inválidas");
                error = true;
                sc.nextLine();
            }
        } while (error);
    }
}