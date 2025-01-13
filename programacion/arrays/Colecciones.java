package programacion.arrays;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();

        // Instaciamos colección vacía
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Añadimos elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(9);

        // Insertamos en posición 1
        numeros.add(1, 10);

        // Mostramos con for clásico
        for (int i = 0; i < numeros.size(); i++) {
            System.out.printf("%5d", numeros.get(i));
        }
        System.out.println();

        // Modificamos un elemento
        numeros.set(0, 22);

        // Eliminamos el elemento de la posición 2 (Es el tercero)
        numeros.remove(2);
        
        // Mostramos con foreach
        for (int numero : numeros) {
            System.out.printf("%5d", numero);
        }
        System.out.println();

    }
}
