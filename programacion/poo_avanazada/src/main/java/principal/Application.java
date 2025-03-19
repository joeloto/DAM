package principal;

public class Application {
    public static void main(String[] args) {
        Animal a = new Animal();

        Mosca m = new Mosca();
        Perro p = new Perro(8,"Labrador","Arrow");

        System.out.println(m.nombreCientifico);
        System.out.println(m.getEdad());

        System.out.println(p.nombreHumano);
        System.out.println(p.getEdad());
    }
}
