package boletin_tema5.ejercicio8;

import java.util.*;

public class Coleccion {

    private ArrayList<Videojuego> videojuegos = new ArrayList<>();

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.-Insertar nuevo videojuego");
            System.out.println("2.-Visualizar toda la lista de videojuegos");
            System.out.println("3.-Buscar videojuegos");
            System.out.println("4.-Eliminar videojuegos (por posiciones)");
            System.out.println("5.-Borrar videojuegos de un año determinado");
            System.out.println("6.-Salir");
            System.out.println("Teclee opción (1-4)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Que videojuego quieres insertar?");
                    String juego = sc.nextLine();
                    System.out.println(
                            "Escribe 'f' si lo quieres poner al final o escribe 'p' si lo quieres poner al principio");
                    String opc = sc.nextLine();
                    if (opc == "f") {
                        videojuegos.add();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 6:
                    System.out.println("Hasta otra!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }
}
