package ejercicio2.principal;

import java.util.*;

import ejercicio2.geometria.Circunferencia;
import ejercicio2.geometria.Figura;
import ejercicio2.geometria.Linea;
import ejercicio2.geometria.Poligono;
import ejercicio2.geometria.Punto;
import ejercicio2.interfaz.Libreria;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figura> coleccion = new ArrayList<>();

        int opcion;
        int opcion2;
        double x1;
        double y1;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.-Añadir una línea, un triángulo, un cuadrado o una circunferencia");
            System.out.println("2.-Mostrar los elementos de la colección");
            System.out.println("3.-Mostrar datos de un elemento de la colección");
            System.out.println("4.-Borrar elementos de un tipo en concreto");
            System.out.println("5.-Salir");
            System.out.println("Teclee opción (1-5)");
            opcion = Libreria.pedirEntero();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce 1 para insertar una línea");
                    System.out.println("Introduce 2 para insertar un triángulo");
                    System.out.println("Introduce 3 para insertar un cuadrado");
                    System.out.println("Introduce 4 para insertar una circunferencia");
                    opcion2 = Libreria.pedirEntero();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Has elegido introducir una");
                            System.out.println("Primer punto de la linea");
                            System.out.println("Punto x:");
                            x1 = Libreria.pedirDouble();
                            System.out.println("Punto y:");
                            y1 = Libreria.pedirDouble();
                            Punto p1 = new Punto(x1, y1);
                            System.out.println("Segundo punto de la linea");
                            System.out.println("Punto x:");
                            double x2 = Libreria.pedirDouble();
                            System.out.println("Punto y:");
                            double y2 = Libreria.pedirDouble();
                            Punto p2 = new Punto(x2, y2);
                            coleccion.add(new Linea(p1, p2));
                            break;
                        case 2:
                            System.out.println("Has elegido introducir un triángulo");
                            System.out.println("Define el punto");
                            System.out.println("Punto x:");
                            x1 = Libreria.pedirDouble();
                            System.out.println("Punto y:");
                            y1 = Libreria.pedirDouble();
                            coleccion.add(new Poligono("triángulo", new Punto(x1, y1), 3));
                            break;
                        case 3:
                            System.out.println("Has elegido introducir un cuadrado");
                            System.out.println("Define el punto");
                            System.out.println("Punto x:");
                            x1 = Libreria.pedirDouble();
                            System.out.println("Punto y:");
                            y1 = Libreria.pedirDouble();
                            coleccion.add(new Poligono("cuadrado", new Punto(x1, y1), 4));
                            break;
                        case 4:
                            System.out.println("Has elegido introducir una circunferencia");
                            System.out.println("Introduce el radio:");
                            double radio = Libreria.pedirDouble();
                            System.out.println("Define el punto");
                            System.out.println("Punto x:");
                            x1 = Libreria.pedirDouble();
                            System.out.println("Punto y:");
                            y1 = Libreria.pedirDouble();
                            coleccion.add(new Circunferencia(new Punto(x1, y1), radio));
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Colección de figuras:");
                    for (Figura figura : coleccion) {
                        if (figura instanceof Circunferencia) {
                            System.out.println(figura.getNombre() + " de radio " + ((Circunferencia) figura).radio);
                        } else {
                            System.out.println(figura.getNombre());
                        }
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el índice de la figura que quieres mostrar los datos?");
                    int indice = Libreria.pedirEntero();
                    if (indice > 0 && indice >= coleccion.size()){
                        System.out.println("Índice fuera de rangos");
                    }
                    coleccion.get(indice).mostrarDatos();
                    break;
                case 4:
                    System.out.println("Introduce 1 para borrar elementos tipo línea");
                    System.out.println("Introduce 2 para borrar elementos tipo polígono");
                    System.out.println("Introduce 3 para borrar elementos tipo circunferencia");
                    int opcion3 = Libreria.pedirEntero();
                    switch (opcion3) {
                        case 1:
                            for (int i = coleccion.size() - 1; i >= 0; i--) {
                                if (coleccion.get(i).getClass() == Linea.class) {
                                    coleccion.remove(i);
                                }
                            }
                            break;
                        case 2:
                            for (int i = coleccion.size() - 1; i >= 0; i--) {//
                                if (coleccion.get(i).getClass() == Poligono.class) {
                                    coleccion.remove(i);
                                }
                            }
                            break;
                        case 3:
                            for (int i = coleccion.size() - 1; i >= 0; i--) {///
                                if (coleccion.get(i).getClass() == Circunferencia.class) {
                                    coleccion.remove(i);
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Hasta otra!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }
}
