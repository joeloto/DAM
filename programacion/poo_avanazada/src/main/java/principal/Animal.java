package principal;

public class Animal {
  public String nombreCientifico;
  private int edad;

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public Animal() {
  }

  public Animal(int edad, String nombreCientifico) {
    this.setEdad(edad);
    this.nombreCientifico = nombreCientifico;
  }
}