package programacion.POO;

public class Perro {
    public String raza;
    public String nombre;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else{
            this.edad = 0;
        }
    }

    private double temperatura;

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
        if (temperatura > 39) {
            fiebre = true;
        } else{
            fiebre = false;
        }
    }

    private boolean fiebre;
    public boolean getFiebre(){
        return fiebre;
    }

    public Perro(String nombre, String raza, int edad, double temperatura){
        this.nombre = nombre;
        this.raza = raza;
        this.setEdad(edad);
        this.setTemperatura(temperatura);
    }
}
