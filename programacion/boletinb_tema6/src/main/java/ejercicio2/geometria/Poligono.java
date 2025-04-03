package ejercicio2.geometria;

public class Poligono extends Figura{
    public Punto[] puntos;

    public Poligono(String nombre, Punto origen, int numPuntos) {
        super(origen,nombre);
        puntos = new Punto[numPuntos];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Punto(Math.random(),Math.random());
        }
    }

    public Poligono() {
        this("triángulo", new Punto(0,0), 3);
        puntos[0] = new Punto(0,0);
        puntos[1] = new Punto(1,1);
        puntos[2] = new Punto(1,0);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        System.out.println("Dime el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Introduce el centro del punto x");
        double p1 = sc.nextDouble();
        System.out.println("Introduce el centro del punto y");
        double p2 = sc.nextDouble();
        origen = new Punto(p1,p2);
        System.out.println("Introduce la cantidad de puntos");
        int cantidad = sc.nextInt();
        puntos = new Punto[cantidad];

        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Introduce x del punto número" + (i + 1));
            double px = sc.nextDouble();
            System.out.println("Introduce y del punto número" + (i + 1));
            double py = sc.nextDouble();
            puntos[i] = new Punto(px,py);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nombre: " + nombre);
        System.out.println("Origen: " + origen);
        System.out.println("Puntos:");
        for (Punto punto : puntos) {
            System.out.println(punto);
        }
    }
}
