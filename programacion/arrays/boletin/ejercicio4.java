package programacion.arrays.boletin;

public class ejercicio4 {
    
    public static void muestraEnLinea(String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    public static String subCadena(String cadena, int posicionInicio, int numCaracteres){
        String cadenaDefinitiva = "";
        for (int i = posicionInicio; i <= numCaracteres; i++) {
            cadenaDefinitiva += cadena.charAt(i);
        }
        if (cadena == null || numCaracteres > cadena.length()) {
            return "";
        }
        return cadenaDefinitiva;
    }

    public static void main(String[] args) {
        String a = "jinetes de rohan";
        //muestraEnLinea(a);
        System.out.println(subCadena(a, 2, 4));
    }
}

//  subCadena(a, 2, 4)      "nete"