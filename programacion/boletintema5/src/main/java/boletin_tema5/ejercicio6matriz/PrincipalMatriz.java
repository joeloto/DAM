package boletin_tema5.ejercicio6matriz;

import java.util.*;

public class PrincipalMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matriz m = new Matriz(10);

        int opcion;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Mostrar matriz");
            System.out.println("2.- Suma de todos los elementos");
            System.out.println("3.- Suma de la diagonal");
            System.out.println("4.- Suma de los elementos salvo la diagonal");
            System.out.println("5.- Suma de elementos de una fila");
            System.out.println("6.- Mostrar matriz sin una fila");
            System.out.println("7.- Salir");
            System.out.println("Teclee opción (1-7)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Matriz.mostrar(m.matriz);
                    break;
                case 2:
                    System.out.println("La suma es: " + m.suma());
                    break;
                case 3:
                    System.out.println("La suma de los elementos de la diagonal es: " + m.suma(true));
                    break;
                case 4:
                    System.out.println("La suma de los elementos que no son de la diagonal es: " + m.suma(false));
                    break;
                case 5:
                    System.out.println("¿De qué fila quieres que se sumen los elementos?");
                    int linea = sc.nextInt();
                    
                case 6:
                    Matriz.mostrar(m.matriz);
                    System.out.println("¿De qué fila quieres que se sumen los elementos?");
                    int linea2 = sc.nextInt();
                case 7:
                    System.out.println("Hasta otra!");
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 7);
    }
}
