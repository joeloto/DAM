package principal;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Perro> perros = new ArrayList<>();

        perros.add(new Perro(2, "Pastor", "Richard"));
        perros.add(new Perro(5, "Palleiro", "Lucky"));
        perros.add(new Perro(5, "Pekines", "Buff"));
        perros.add(new Perro(5, "Caniche", "Thor"));

        Perro p = new Perro(5, "Pekines", "Buff");

        System.out.printf("%s %s existe en la colección\n",
                p.nombreHumano, perros.contains(p) ? "sí" : "no");


        // Animal a = new Animal();

        // Mosca m = new Mosca();
        // Perro p = new Perro(8,"Labrador","Arrow");

        // System.out.println(m.nombreCientifico);
        // System.out.println(m.getEdad());

        // System.out.println(p.nombreHumano);
        // System.out.println(p.getEdad());

        // Perro objPerro = new Perro(5, "Pastor", "Laika");
        // Animal objAnimal;

        // objAnimal = objPerro;

        // System.out.println(objAnimal.getEdad());
        // System.out.println(objAnimal.nombreCientifico);

        // Perro p = (Perro) objAnimal;
        // System.out.println(p.raza);
        // p.ladrar();

        // ((Mosca) objAnimal).muestraDatos();

        // Animal[] bichos = new Animal[3];
        // bichos[0] = new Perro(5, "Pastor", "Laika");
        // bichos[1] = new Mosca();
        // bichos[2] = new Ardilla();

        // for (Animal animal : bichos) {
        // if (animal.getClass() == Perro.class) {
        // System.out.println(((Perro)animal).nombreHumano);
        // } else{
        // if (animal.getClass() == Mosca.class) {
        // animal.muestraDatos();
        // } else{
        // System.out.println(animal.nombreCientifico);
        // }
        // }
        // }

        // ArrayList<Object> cosas = new ArrayList<>();
        // cosas.add("Hola");
        // cosas.add(8);
        // cosas.add(new Perro());
        // cosas.add(bichos);
    }
}
