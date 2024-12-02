package programacion.POO;

public class Principal {

    public static void main(String[] args) {
        Perro perro = new Perro();

        perro.nombre = "Skipper";

        perro.raza = "can palleiro";

        perro.setEdad(4);

        System.out.printf("Tengo un %s llamado %s de %d años\n",
                perro.raza, perro.nombre,
                perro.getEdad());
    }
}
