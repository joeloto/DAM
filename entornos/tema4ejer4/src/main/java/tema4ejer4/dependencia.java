
package tema4ejer4;

import raiz.hola.B;

public class dependencia {

  /**
   * suma de dos numeros
   * @param n numero1
   * @param n2 numero2
   * @return suma de los numeros
   */
  public static int suma(int n, int n2){
    return n + n2;
  }
  public static void main(String[] args) {
    
    B.f2();
  }
}
