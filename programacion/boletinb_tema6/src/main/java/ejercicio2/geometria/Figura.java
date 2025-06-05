package ejercicio2.geometria;

import java.util.Scanner;

import ejercicio2.interfaz.InterfazUsuario;
import ejercicio2.interfaz.Libreria;

public class Figura implements InterfazUsuario {
    Scanner sc = new Scanner(System.in);
    protected Punto origen;
    protected String nombre;
    boolean error;

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
    }

    public Figura(Punto origen, String nombre) {
        setNombre(nombre);
        setOrigen(origen);
    }

    public Figura() {
        this(new Punto(0, 0), "");
    }

    @Override
    public void pedirDatos() {
        System.out.println("Dime el nombre");
        this.nombre = sc.nextLine();
        System.out.println("Dime el origen");
        System.out.println("Primer punto:");
        double p1 = Libreria.pedirDouble();
        System.out.println("Segundo punto:");
        double p2 = Libreria.pedirDouble();
        this.origen = new Punto(p1, p2);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Origen: " + origen);
    }
}
