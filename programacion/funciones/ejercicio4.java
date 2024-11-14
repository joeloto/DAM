// a) Función año bisiesto. Realizar una función denominada bisiesto a la cual se le
// pasa un año como parámetro y devuelve true si dicho año es bisiesto y false en
// caso contrario.

// Un año es bisiesto cuando:
// • Es múltiplo de 4 (P. ej 1984)
// • Pero los múltiplos de 100 no lo son (Por ejemplo 1800)
// • Salvo si a su vez son múltiplos de 400 que caso sí lo son (p. ej. 2000)

// b) En el programa principal se hará un bucle que pida continuamente años al
// usuario hasta que introduzca el año 0 momento en el cual el programa termina. Por
// cada año introducido debe indicar si es o no bisiesto utilizando la función previa.


import java.util.Scanner;

public class ejercicio4 {

    /**
     * comprueba si el año es bisiesto
     * @param year recoge el año
     * @return si el año es bisiesto o no
     */
    public static boolean bisiesto(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        do {
            System.out.println("Si es bisiesto saldrá true si no saldrá false");
            year = sc.nextInt();
            System.out.println(bisiesto(year));
        } while (year != 0);
    }
}
