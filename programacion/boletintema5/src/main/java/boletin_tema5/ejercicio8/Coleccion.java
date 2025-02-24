package boletin_tema5.ejercicio8;

import java.util.*;

public class Coleccion {

    private ArrayList<Videojuego> videojuegos = new ArrayList<>();
    Videojuego juego = new Videojuego();

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
                    System.out.println("Escribe el titulo del videojuego");
                    String nombre = sc.nextLine();
                    sc.nextLine();
                    juego.setTitulo(nombre);
                    System.out.println("Inserta su año de salida");
                    int year = sc.nextInt();
                    juego.setYear(year);
                    System.out.println("Escribe el nombre del fabricante");
                    String fabricante = sc.nextLine();
                    juego.setFabricante(fabricante);
                    sc.nextLine();
                    String opc;
                    System.out.println(
                            "Escribe 'f' si lo quieres poner al final o escribe 'p' si lo quieres poner al principio");
                    opc = sc.nextLine().trim().toLowerCase();
                    do {
                        if (opc == "p") {
                            videojuegos.add(0, juego);
                        } else if (opc == "f") {
                            videojuegos.add(juego);
                        }
                    } while (opc != "p" && opc != "f");
                    break;
                case 2:
                    System.out.println("\nListado de Videojuegos");
                    System.out.println();
                    System.out.printf("%5s %25s %25s %10s\n", "#", "Título", "Fabricante", "Año");
                    System.out.println("---------------------------------------------------------------");

                    int contFilas = 0;
                    for (Videojuego videojuego : videojuegos) {
                        String titulo = videojuego.getTitulo();
                        if (titulo.length() > 23) {
                            titulo = titulo.substring(0, 20) + "...";
                        }

                        String fabricante2 = videojuego.getFabricante();
                        if (fabricante2.length() > 23) {
                            fabricante = fabricante2.substring(0, 20) + "...";
                        }

                        contFilas++;
                        System.out.printf("%5d %25s %25s %10d\n", contFilas, titulo, fabricante2,
                                videojuego.getYear());
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Indica la posición del videojuego que quieres borrar");
                    int indice = sc.nextInt();
                    videojuegos.remove(indice);
                    System.out.println("Juego eliminado.");
                    break;
                case 5:

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

    public static void main(String[] args) {

    }
}
