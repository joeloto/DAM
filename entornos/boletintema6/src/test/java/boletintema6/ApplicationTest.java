
package boletintema6;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

 
import pruebas.ejercicio1.AreaCilindro;
import pruebas.ejercicio1.Bisiesto;
import pruebas.ejercicio1.Potencia;
import pruebas.ejercicio2.*;

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

  //EJERCICIO 3
  @Test
  public void testVectores(){
    
  }
}
