package boletin_tema5.ejercicio7;

import java.util.*;

public class Ejercicio7 {

    public static void rellenaCol(ArrayList<Integer> coleccion) {
        coleccion.clear();
        for (int i = 0; i <= 6; i++) {
            coleccion.add((int) (Math.random() * 50 + 1));
        }
    }

    public static int compara(ArrayList<Integer> coleccion1, ArrayList<Integer> coleccion2) {
        int contador = 0;
        for (Integer elemento : coleccion1) {
            if (coleccion2.contains(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrar(int[] array){
        for (int num : array) {
            System.out.print(num + " - ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> coleccion = new ArrayList<>();

        System.out.println("Introduce seis números entre 1 y 49 separados por comas");
        String numeroscomas = sc.nextLine();

        String[] numeros = numeroscomas.split(",");

        for (String cifra : numeros) {
            int numero = Integer.parseInt(cifra);
            if (numero <= 0 || numero > 49) {
                System.out.println("Uno o más números están fuera de rangos");
            } else {
                coleccion.add(numero);
            }
        }

        int[] victoria = new int[7];
        ArrayList<Integer> loteria = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            rellenaCol(loteria);
            int indice = compara(coleccion, loteria);
            victoria[indice]++;
        }
        mostrar(victoria);

    }
}
