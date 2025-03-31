package principal.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1  {

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
            System.out.println("Longitud de la cadena" + cadena.length());
            System.out.println("Posición de inicio: " + posicionInicio);
            System.out.println("Números carácteres: " + numCaracteres);
            throw new WrongParametersException("Cadena parámetros incorrectos");
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
            throw new StringTooLongException();
        }
        int espacios = (consola - cadena.length())/2;
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print(cadena);
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
            } catch (InputMismatchException | WrongParametersException e) {
                System.out.println("Variables inválidas");
                error = true;
                sc.nextLine();
            }
        } while (error);
    }
}
