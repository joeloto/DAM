
package boletintema6;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pruebas.ejercicio1.AreaCilindro;
import pruebas.ejercicio1.Bisiesto;
import pruebas.ejercicio1.Potencia;
import pruebas.ejercicio2.*;
import pruebas.ejercicio3.Vectores;
import pruebas.ejercicio4.Cadena2;

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
    assertEquals(-1, Potencia.potencia(-1, 1), 0.00001);
    assertEquals(1, Potencia.potencia(-1, 2), 0.00001);
    assertEquals(0, Potencia.potencia(0, 1), 0.00001);
    assertEquals(1, Potencia.potencia(-1, 0), 0.00001);
    assertEquals(1, Potencia.potencia(0, 0), 0.00001);
    assertEquals(-1, Potencia.potencia(-1, -1), 0.00001);
    assertEquals(Double.POSITIVE_INFINITY, Potencia.potencia(0, -1), 0.00001);
  }

  // EJERCICIO 2
  static String cadena;

  @BeforeAll
  public static void cadenaHola() {
    cadena = "hola";
  }

  @Test
  public void testSubcadena() {
    assertEquals(cadena, Cadena.subCadena(cadena, 0, 4));
    assertEquals("ol", Cadena.subCadena(cadena, 1, 2));
    assertEquals("a", Cadena.subCadena(cadena, 3, 1));
  }

  @Test
  public void testSubcadenaException() {
    try {
      Cadena.subCadena(cadena, 0, 5);
      fail("No salta excepción");
    } catch (WrongParametersException e) {
      assertTrue(true);
    }
  }

  @Test
  public void testSubcadenaException2() {
    try {
      Cadena.subCadena(cadena, 0, -1);
      fail("No salta excepción");
    } catch (WrongParametersException e) {
      assertTrue(true);
    }
  }

  @Test
  public void testSubcadenaException3() {
    try {
      Cadena.subCadena(cadena, -1, 7);
      fail("No salta excepción");
    } catch (WrongParametersException e) {
      assertTrue(true);
    }
  }

  // EJERCICIO 3 (pendiente validar)

  static int[] vector;
  static int[] v2;
  static int[] vacio;
  static int[] vacio2;
  static int[] uno;
  static int[] otro;
  static int[] desordenado1;
  static int[] ordenado1;
  static int[] repetidos1;
  static int[] repOrd;
  
  // TODO usar before para inicializacion de vetores
  @BeforeAll
  public static void iniciaVector() {
    vector = new int[] { 6, 3, 1, 4, 5 };
    uno = new int[] { 4 };
    otro = new int[] { 4 };
    vacio = new int[] {};
    vacio2 = new int[] {};
    v2 = new int[] { 1, 3, 8, 4, 5 };
    desordenado1 = new int[] { 2, 3, 4, 5, 1 };
    ordenado1 = new int[] { 1, 2, 3, 4, 5 };
    repetidos1 = new int[] { 1, 4, 3, 3, 2 };
    repOrd = new int[] { 1, 2, 3, 3, 4 };
  }

  @Test
  public void testVectoresMax() {
    assertEquals(6, Vectores.maximo(vector));// TODO más pruebas
    assertEquals(8, Vectores.maximo(v2));
    assertEquals(5, Vectores.maximo(ordenado1));

    assertEquals(4, Vectores.maximo(uno));

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
    assertEquals(1, Vectores.minimo(vector));// TODO más pruebas
    assertEquals(1, Vectores.minimo(v2));
    assertEquals(1, Vectores.maximo(desordenado1));

    assertEquals(4, Vectores.minimo(uno));

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
    assertTrue(Vectores.intercambio(vector, 0, 2));// TODO más pruebas y completar
    assertArrayEquals(new int[] { 1, 3, 6, 4, 5 }, vector);

    vector = new int[] { 6, 3, 1, 4, 5 };
    assertTrue(Vectores.intercambio(vector, 0, vector.length - 1));
    assertArrayEquals(new int[] { 5, 3, 1, 4, 6 }, vector);

    vector = new int[] { 6, 3, 1, 4, 5 };
    assertTrue(Vectores.intercambio(vector, vector.length - 1, 2));
    assertArrayEquals(new int[] { 6, 3, 5, 4, 1 }, vector);

    vector = new int[] { 6, 3, 1, 4, 5 };
    assertTrue(Vectores.intercambio(vector, 2, 3));
    assertArrayEquals(new int[] { 6, 3, 4, 1, 5 }, vector);

    vector = new int[] { 6, 3, 1, 4, 5 };
    assertTrue(Vectores.intercambio(vector, 2, 2));
    assertArrayEquals(new int[] { 6, 3, 1, 4, 5 }, vector);

    vector = new int[] { 6, 3, 1, 4, 5 };
    assertTrue(Vectores.intercambio(vector, 2, 0));
    assertArrayEquals(new int[] { 1, 3, 6, 4, 5 }, vector);

    repetidos1 = new int[] { 1, 4, 3, 3, 2 };
    assertTrue(Vectores.intercambio(repetidos1, 2, 3));
    assertArrayEquals(new int[] { 1, 4, 3, 3, 2 }, repetidos1);

    assertFalse(Vectores.intercambio(vector, -2, 0));

    assertFalse(Vectores.intercambio(vector, 2, -4));

    assertFalse(Vectores.intercambio(vector, 0, vector.length));

    assertFalse(Vectores.intercambio(vector, -1, vector.length - 1));

    assertFalse(Vectores.intercambio(vector, vector.length, 2));

    assertTrue(Vectores.intercambio(uno, 0, 0));
    assertArrayEquals(otro, uno);

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
    assertArrayEquals(ordenado1, Vectores.ordenavector(desordenado1));
    assertArrayEquals(ordenado1, Vectores.ordenavector(ordenado1));
    assertArrayEquals(repOrd, Vectores.ordenavector(repetidos1));
    assertArrayEquals(otro, Vectores.ordenavector(uno));
    assertArrayEquals(vacio2, Vectores.ordenavector(vacio));

    assertNull(Vectores.ordenavector(null));
  }

  @Test
  public void testSumaRango() {// TODO más pruebas
    assertEquals(11, Vectores.sumaRango(v2, 1, 2));
    assertEquals(4, Vectores.sumaRango(v2, 0, 1));
    assertEquals(13, Vectores.sumaRango(v2, 2, v2.length - 1));
    assertEquals(6, Vectores.sumaRango(v2, 0, v2.length - 1));

    int[] vacio = {};
    assertEquals(0, Vectores.sumaRango(vacio, 2, 1));

    try {
      Vectores.sumaRango(v2, 2, v2.length);
      fail("Se espera error, parámetro inválido");
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }

    try {
      Vectores.sumaRango(v2, -1, 3);
      fail("Se espera error, parámetro inválido");
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }

    try {
      Vectores.sumaRango(v2, -4, 8);
      fail("Se espera error, parámetros inválidos");
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }

    try {
      Vectores.sumaRango(null, 0, 2);
      fail("Se espera error, parámetro inválido");
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }
  }

  // EJERCICIO 4 (pendiente validar)
  static Cadena2 c1;

  @BeforeAll
  public static void creaObj() {
    c1 = new Cadena2();
    c1.setCadena("java");
  }

  @Test
  public void testEquals() {
    Cadena2 c2 = new Cadena2();
    c2.setCadena("java");
    assertTrue(c1.equals(c2));

    Cadena2 c3 = new Cadena2();
    c3.setCadena("javac");
    assertFalse(c1.equals(c3));

    try {
      c1.equals(null);
      fail("Se espera error, objeto nulo");
    } catch (NullPointerException e) {
      assertTrue(true);
    }

    try {
      c1.equals(12);
      fail("Se espera error, parámetro incorrecto");
    } catch (IllegalArgumentException e) {
      assertTrue(true);
    }

    char[] v1 = { 'j', 'a', 'v', 'a' };
    assertTrue(c1.equals(v1));

    char[] v2 = { 'l', 'a', 'v', 'a' };
    assertFalse(c1.equals(v2));

    assertTrue(c1.equals("java"));

    assertFalse(c1.equals("lava"));

  }

  @Test
  public void testEliminar() {
    char caracter = 'a';
    assertEquals(2, c1.eliminar(caracter));

    char caracter2 = 'y';
    assertEquals(0, c1.eliminar(caracter2));
  }

}
