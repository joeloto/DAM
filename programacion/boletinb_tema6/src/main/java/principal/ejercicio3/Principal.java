package principal.ejercicio3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Cadena c1 = new Cadena();
        c1.setCadena("moon");
        System.out.println(c1.toString());
        System.out.println("Cadena original: " + c1);
        Cadena c2 = new Cadena();
        c2.setCadena("monster");
        System.out.println("Cadenas iguales? " + c1.equals(c2));   
        char[] lista = {'m','o','o','n'};
        System.out.println("Cadenas iguales? " + c1.equals(lista));
        int eliminar = c1.eliminar('o');
        System.out.println("Caracteres eliminados:" + eliminar);
    }
}
