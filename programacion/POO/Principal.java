package programacion.POO;

public class Principal {

    public static void main(String[] args) {
        Perro perro = new Perro("Skipper","can palleiro",5,36);

        // perro.fiebre = false;

        System.out.printf("Tengo un %s llamado %s de %d años\n",
                perro.raza, perro.nombre,
                perro.getEdad());
    }
}
