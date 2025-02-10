
package exception;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dividendo, divisor;
    try {

      System.out.println("Por favor, introduce dividendo");
      dividendo = Integer.parseInt(sc.nextLine());
      System.out.println("ahora el divisor");
      divisor = Integer.parseInt(sc.nextLine());
      System.out.printf("El resultado es %d\n", dividendo / divisor);
    } catch (NumberFormatException e) {
      System.out.println("Ha introducido un dato no válido");
    } catch (ArithmeticException e) {
      System.out.println("No puedo dividir entre 0");
    }
    System.out.println("Fin del programa");
  }
}
