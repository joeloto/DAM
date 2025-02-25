package boletin_tema5.examenPrueba.Ejercicio2;

public class Astro {

    public double radio;
    private String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre(){
        return nombre;
    }

    public String getNombre(char caracter){
        String cadenaResult = "";
        for (int i = 0; i < nombre.length(); i++) {
           cadenaResult += nombre.charAt(i);
           if (i < nombre.length() - 1) {
            cadenaResult += caracter;
           }
        }
        return cadenaResult;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void muestraDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.printf("El radio: %.2d", getRadio());
    }

    public Astro(String nombre, double radio){
        setNombre(nombre);
        setRadio(radio);
    }

    public Astro(){}
}