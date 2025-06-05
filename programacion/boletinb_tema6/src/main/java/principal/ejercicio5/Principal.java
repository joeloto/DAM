package principal.ejercicio5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> galaxia = new ArrayList<>();
        boolean error = false;
        boolean error2 = false;
        boolean error3 = false;
        Planeta pl = new Planeta();

        int opcion;

        do {
            try {
                error = false;
                do {
                    System.out.println("Menú de opciones");
                    System.out.println("----------------");
                    System.out.println("1.-Añade planeta");
                    System.out.println("2.-Añade un tipo de astro");
                    System.out.println("3.-Mostrar datos");
                    System.out.println("4.-Eliminar repetidos");
                    System.out.println("5.-Salir");
                    System.out.println("Teclee opción (1-5)");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            do {
                                error2 = false;
                                try {
                                    System.out.println("Has elegido introducir un planeta");
                                    System.out.println("Dime el nombre");
                                    String nombreP = sc.nextLine();
                                    boolean gas = true;
                                    System.out.println("¿Es gaseoso? Escribe 'Si' o 'No'");
                                    String confirm;
                                    do {
                                        confirm = sc.nextLine().trim();
                                        if (confirm.equalsIgnoreCase("Si")) {
                                            gas = true;
                                        } else if (confirm.equalsIgnoreCase("No")) {
                                            gas = false;
                                        } else {
                                            System.out.println("Entrada no válida. Di 'Si' o 'No'");
                                        }
                                    } while (!confirm.equalsIgnoreCase("Si") && !confirm.equalsIgnoreCase("No"));

                                    System.out.println("Dime su radio");
                                    double radioP = sc.nextDouble();
                                    pl = new Planeta(gas, nombreP, radioP);
                                    System.out.println("¿Cuántas lunas tiene? ");
                                    int cantidad = sc.nextInt();
                                    for (int i = 0; i < cantidad; i++) {
                                        System.out.println("Nombre de la luna " + (i + 1) + ": ");
                                        String nLuna = sc.nextLine();
                                        System.out.println("Radio de la luna: ");
                                        double rLuna = sc.nextDouble();
                                        pl.satelites.add(new Astro(nLuna, rLuna));
                                    }
                                    galaxia.add(pl);
                                } catch (InputMismatchException | IllegalArgumentException e) {
                                    System.out.println("Has introducido un dato incorrecto");
                                    error2 = true;
                                }
                            } while (error2);
                            break;
                        case 2:
                        do {
                            try {
                                System.out.println("Has elegido introducir un planeta");
                                System.out.println("Dime el nombre");
                                String nombreA = sc.nextLine();
                                double radioA = sc.nextDouble();
                                galaxia.add(new Astro(nombreA, radioA));
                                break;
                            } catch (InputMismatchException | IllegalArgumentException e) {
                                System.out.println("Has introducido un dato incorrecto");
                                error3 = true;
                            }
                        } while (error3);
                        case 3:
                            for (Astro astro : galaxia) {
                                if (astro.getClass() == Astro.class) {
                                    System.out.println(astro.toString());
                                }
                                if (astro.getClass() == Planeta.class) {
                                    System.out.println(((Planeta) astro).toString());
                                    for (Astro luna : pl.satelites) {
                                        System.out.println(luna);
                                        //recorrer col satelites
                                    }
                                }
                            }
                            break;
                        case 4:
                            for (int i = 0; i < galaxia.size(); i++) {
                                for (int j = galaxia.size() - 1; j > i; j--) {
                                    if (galaxia.get(i).equals(galaxia.get(j))) {
                                        galaxia.remove(j);
                                    }
                                }
                            }
                            System.out.println("Repetidos eliminados.");
                            break;
                        case 5:
                            System.out.println("Hasta otra!");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } while (opcion != 5);
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número");
                error = true;
                sc.nextLine();
            }
        } while (error);

        sc.close();
    }
}