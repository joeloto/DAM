// Haz un programa que realice las siguientes tareas:

// Pide un año al usuario y guarda en un archivo dicho año en la primera línea
// indicando si es o no bisiesto y a continuación todos los bisiestos desde ese año
// hasta el año actual (cada uno en una línea).

// Un ejemplo de como puede quedar el archivo:
// 2015 No es bisiesto.
// 2016
// 2020
// 2024

// A continuación lee el archivo y muestra en pantalla todos los años menos el
// primero. Debe estar separados por comas en la misma linea y ocupando 6
// caracteres.

// Si este programa lo tienes en la misma carpeta que el de bisiesto no es necesario
// que copies la función, puedes acceder a ella poniendo NombreClase.nombreFuncion.


import java.io.*;
import java.util.Scanner;

public class ejercicio5 {

    public static boolean bisiesto(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // PrintWriter f = new PrintWriter("ejercicio5.txt");

        // f.println((bisiesto(year) == true) ? year + " Es bisiesto " : year + " No es bisiesto ");
        // for (int cont = year; cont <= 2024; cont++) {
        //     if (bisiesto(cont) == true) {
        //         if (cont != year) {
        //             f.println(cont);
        //         }
        //     }
        // }
        // f.close();
 

        int year;
        System.out.println("Dime un año");
        year = sc.nextInt();

        // Apertura
        Scanner f = new Scanner(new File("ejercicio5.txt"));
        // f.nextLine();

        // Lectura de datos
        while (f.hasNext()) {
            String a = f.nextLine();
            System.out.printf("%6s, ", a);
        }

        // Cierre
        f.close();

    }

}
