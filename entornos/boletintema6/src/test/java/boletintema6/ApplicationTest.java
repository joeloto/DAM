
package boletintema6;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pruebas.ejercicio1.AreaCilindro;
import pruebas.ejercicio1.Bisiesto;
import pruebas.ejercicio1.Potencia;
import pruebas.ejercicio2.*;
import pruebas.ejercicio3.Vectores;

@DisplayName("Application")
public class ApplicationTest {

  @Test
  @DisplayName("Pointless test")
  void smokeTest() {
    assertThat(true).isEqualTo(true);
  }

  // EJERCICIO 1
  @Test
  public void testBisiesto() {
    assertFalse(Bisiesto.bisiesto(1800));
    assertTrue(Bisiesto.bisiesto(2000));
    assertTrue(Bisiesto.bisiesto(2004));
    assertFalse(Bisiesto.bisiesto(2006));
    assertFalse(Bisiesto.bisiesto(2021));
  }

  @Test
  public void testCilindro() {
    double esperado = 2 * Math.PI * 1 * 1;
    assertEquals(esperado, AreaCilindro.superf(1, 1), 0.00001);
  }

  @Test
  public void testPotencia() {
    assertEquals(8, Potencia.potencia(2, 3), 0.00001);
    assertEquals(0.25, Potencia.potencia(2, -2), 0.00001);
    assertEquals(1, Potencia.potencia(2, 0), 0.00001);
  }

  // EJERCICIO 2
  @Test
  public void testSubcadena() {
    String cadena = "hola";
    assertEquals(cadena, Cadena.subCadena(cadena, 0, 4));
    assertEquals("ol", Cadena.subCadena(cadena, 1, 2));
    assertEquals("a", Cadena.subCadena(cadena, 3, 1));
  }

  @Test
  public void testSubcadenaException() {
    String cadena = "hola";
    try {
      Cadena.subCadena(cadena, 0, 5);
      fail("No salta excepción");
    } catch (WrongParametersException e) {
      assertTrue(true);
    }
  }

  @Test
  public void testSubcadenaException2() {
    String cadena = "hola";
    try {
      Cadena.subCadena(cadena, 0, -1);
      fail("No salta excepción");
    } catch (WrongParametersException e) {
      assertTrue(true);
    }
  }

  @Test
  public void testSubcadenaException3() {
    String cadena = "hola";
    try {
      Cadena.subCadena(cadena, -1, 7);
      fail("No salta excepción");
    } catch (WrongParametersException e) {
      assertTrue(true);
    }
  }

  // EJERCICIO 3
  @Test
  public void testVectoresMax() {
    int[] vector = { 1, 2, 3, 4, 5 };
    assertEquals(5, Vectores.maximo(vector));

    int[] uno = { 4 };
    assertEquals(4, Vectores.maximo(uno));

    int[] vacio = {};
    try {
      Vectores.maximo(vacio);
      fail("Se espera error, vector vacío");
    } catch (IndexOutOfBoundsException e) {
      assertTrue(true);
    }

    try {
      Vectores.maximo(null);
      fail("Se espera error, vector nulo");
    } catch (NullPointerException e) {
      assertTrue(true);
    }
  }

  @Test
  public void testVectoresMin() {
    int[] vector = { 1, 2, 3, 4, 5 };
    assertEquals(1, Vectores.minimo(vector));

    int[] uno = { 4 };
    assertEquals(4, Vectores.minimo(uno));

    int[] vacio = {};
    try {
      Vectores.minimo(vacio);
      fail("Se espera error, vector vacío");
    } catch (IndexOutOfBoundsException e) {
      assertTrue(true);
    }

    try {
      Vectores.minimo(null);
      fail("Se espera error, vector nulo");
    } catch (NullPointerException e) {
      assertTrue(true);
    }
  }

  @Test
  public void testVectoresIntercambio() {
    int[] vector = { 1, 2, 3, 4, 5 };
    assertTrue(Vectores.intercambio(vector, 1, 2));

    int[] v2 = { 1, 3, 2, 4, 5 };
    assertArrayEquals(v2, vector);

    int[] uno = { 4 };
    assertTrue(Vectores.intercambio(uno, 0, 0));
    int[] otro = { 4 };
    assertArrayEquals(otro, uno);

    int[] vacio = {};
    assertFalse(Vectores.intercambio(vacio, 1, 4));

    try {
      Vectores.intercambio(null, 1, 2);
      fail("Se espera error, vector nulo");
    } catch (NullPointerException e) {
      assertTrue(true);
    }
  }

  @Test
  public void testOrdenar() {
    int[] desordenado1 = {2,3,4,5,1};
    int[] ordenado1 = {1,2,3,4,5};
    assertArrayEquals(ordenado1,Vectores.ordenavector(desordenado1));

    assertArrayEquals(ordenado1, Vectores.ordenavector(ordenado1));

    int[] repetidos1 = {1,4,3,3,2};
    int[] repOrd = {1,2,3,3,4};
    assertArrayEquals(repOrd, Vectores.ordenavector(repetidos1));

    int[] uno1 = {1};
    int[] uno2 = {1};
    assertArrayEquals(uno2, Vectores.ordenavector(uno1));

    int[] vacio1 = {};
    int[] vacio2 = {};
    assertArrayEquals(vacio2, Vectores.ordenavector(vacio1));

    assertNull(Vectores.ordenavector(null));
  }

  @Test
  public void testSumaIndice(){
    int[] v1 = {1,2,3,4,5};
    assertEquals(9, Vectores.sumaRango(v1, 1, 2));

    int[] vacio = {};
    assertEquals(0, Vectores.sumaRango(vacio, 2, 1));

    int[] uno = {3};
    assertEquals(4, Vectores.sumaRango(uno,3,4));

    assertNull(Vectores.sumaRango(null, 2, 3));

    assertEquals(5, Vectores.sumaRango(v1, -1, 8));

    assertEquals(0, Vectores.sumaRango(v1, 3, 1));
  }

  //EJERCICIO 4
  
}
