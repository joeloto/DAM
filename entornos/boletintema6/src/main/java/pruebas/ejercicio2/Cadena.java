package pruebas.ejercicio2;

public class Cadena  {

    /**
     * replica del substring
     * @param cadena recoge la cadena que se quiere utilizar
     * @param posicionInicio recoge la posicion de inicio de la cadena desde donde se quiere empezar
     * @param numCaracteres recoge el numero de caracteres que se quieren coger
     * @return devuelve la cadena resultante o una cadena vacia si no se cumple el if
     */
    public static String subCadena(String cadena, int posicionInicio, int numCaracteres) {
        String cadenaDefinitiva = "";
        if (cadena == null || numCaracteres > cadena.length() - posicionInicio || posicionInicio > cadena.length() || numCaracteres <= 0 || posicionInicio < 0) {
            throw new WrongParametersException("Cadena parámetros incorrectos" + "Longitud de la cadena" + cadena.length() + "Posición de inicio: " + posicionInicio + "Números carácteres: " + numCaracteres);
        }
        for (int i = posicionInicio; i < posicionInicio + numCaracteres; i++) {
            cadenaDefinitiva += cadena.charAt(i);
        }
        
        return cadenaDefinitiva;
    }

    
}
