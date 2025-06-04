package principal.ejercicio5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> galaxia = new ArrayList<>();
        boolean error = false;

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
                            System.out.println("Has elegido introducir un planeta");
                            System.out.println("Dime el nombre");
                            String nombreP = sc.nextLine();
                            System.out.println("¿Es gaseoso? Escribe 'Si' o 'No'");
                            String confirm = sc.nextLine();
                            boolean gas;
                            if (confirm.equals("Si")) {
                                gas = true;
                            } else {
                                gas = false;
                            }
                            System.out.println("Dime su radio");
                            double radioP = sc.nextDouble();
                            galaxia.add(new Planeta(gas, nombreP, radioP));
                            break;
                        case 2:
                            System.out.println("Has elegido introducir un planeta");
                            System.out.println("Dime el nombre");
                            String nombreA = sc.nextLine();
                            double radioA = sc.nextDouble();
                            galaxia.add(new Astro());
                            break;
                        case 3:
                            for (Astro astro : galaxia) {
                                if (astro.getClass() == Astro.class) {
                                    astro.toString();
                                }
                                if (astro.getClass() == Planeta.class) {

                                }
                            }
                            break;
                        case 4:
                            for (Astro astro : galaxia) {
                                for (int i = 0; i < args.length; i++) {
                                    if (astro.equals(i)) {
                                        galaxia.remove(astro);
                                    }
                                }
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
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número");
                error = true;
                sc.nextLine();
            }
        } while (error);

    }
}