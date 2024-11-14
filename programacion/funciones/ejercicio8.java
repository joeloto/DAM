// a) Escribir una función que se le pase un número y que devuelva true o false
// dependiendo de si dicho número es o no es primo.

// b) Para probarla haz un programa principal que pida un n.º mayor que 2 al usuario
// y muestra los números primos menores que dicho número.

// Nota: Un número es primo si y sólo si es divisible únicamente por 1 y por él mismo.
// Por tanto para saber si un número es primo se debe dividir por todos los números
// menores que él y mayores que 1, y si alguna de esas divisiones exacta entonces el
// número NO es primo. Existen métodos de optimizar lo anterior, piensa a ver si se te
// ocurre alguno. El 1 actualmente no se considera primo.


import java.util.Scanner;

public class ejercicio8 {

    /**
     * identifica si un número es primo o no
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Dime un número");
        int num;
        // System.out.println(primo(num));

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
    }
}
