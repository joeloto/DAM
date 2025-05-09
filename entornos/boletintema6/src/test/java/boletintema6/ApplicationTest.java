
package boletintema6;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pruebas.Bisiesto;

@DisplayName("Application")
public class ApplicationTest {

  @Test
  @DisplayName("Pointless test")
  void smokeTest() {
    assertThat(true).isEqualTo(true);
  }

  @Test
  public void testBisiesto(){
    assertFalse(Bisiesto.bisiesto(1800));
    assertTrue(Bisiesto.bisiesto(2000));
    assertTrue(Bisiesto.bisiesto(2004));
    assertFalse(Bisiesto.bisiesto(2006));
    assertFalse(Bisiesto.bisiesto(2021));
  }
}
