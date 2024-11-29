// Modifica el ejercicio anterior de los números primos (solo el main) de forma
// que hagas un menú clásico con estas opciones:

// 1. Mostrar primos menores que uno dado: Esto es lo que ya estaba del
// ejercicio previo.

// 2. Primos en archivo: Pide el nombre de un archivo que debe contener
// números, cada uno en una línea. Lee dicho archivo y muestra dichos números
// en pantalla diciendo si son o no primos.

// 3. Archivo con primos: Similar a 1, se le pide un número mayor que 2 al
// usuario y guarda en un archivo todos los primos desde 2 hasta el que meta el
// usuario. Estarán todos en la misma línea separados por punto y coma (;).

// 4 Salir: El programa solo finaliza si se selecciona esta opción.

import java.util.Scanner;
import java.io.*;

public class ejercicio9 {
    Scanner sc = new Scanner(System.in);

    /**
     * identifica si un número es primo o no
     * 
     * @param num recoge el número
     * @return devuelve true si es primo y false si no es primo
     */
    public static boolean primo(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("\n\nMENÚ DE OPCIONES");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Pulsa 1 para para mostrar los primos menores que un número");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Pulsa 2 para leer un archivo con números y que muestren si son primos o no");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Pulsa 3 para guardar números primos en un archivo");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Pulsa 4 para salir");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------------");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    int num;
                    do {
                        System.out.println("Dime un valor");
                        num = sc.nextInt();
                        if (num < 2) {
                            System.out.println("Dame un valor mayor que 2");
                        }
                    } while (num < 2);

                    for (int cont = num; cont >= 2; cont--) {
                        if (primo(cont) == true) {
                            if (cont != num) {
                                System.out.println(cont);
                            }
                        }
                    }
                    break;
                case 2:
                    Scanner f = new Scanner(new File("ejercicio9.txt"));
                    String a;
                    while (f.hasNext()) {
                        a = f.nextLine();
                        int n = Integer.parseInt(a);
                        if (primo(n) == true) {
                            System.out.printf("%d es primo; ", n);
                        } else {
                            System.out.printf("%d no es primo; ", n);
                        }
                    }
                    f.close();
                    break;
                case 3:
                    int num2;
                    do {
                        System.out.println("Dime un número");
                        num2 = sc.nextInt();
                        if (num2 < 2) {
                            System.out.println("Dame un número mayor que 2");
                        }
                    } while (num2 < 2);
                    PrintWriter e = new PrintWriter("ejercicio9.1.txt");
                    for (int i = 2; i <= num2; i++) {
                        if (primo(i) == true) {
                            if (i != num2) {
                                e.print(i+";");
                            }
                        }
                    }
                    e.close();
                    break;
                case 4:
                System.out.println("Has salido correctamente del programa");
                    break;
                default:
                    System.out.println("Escoge una opción de las señaladas");
                    break;
            }
        } while (opc != 4);
    }

}

