import java.io.File;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) throws Exception {
        
        String linea;
        Scanner f = new Scanner(new File("prueba.txt"));

        double numero = f.nextDouble();
        f.nextLine();
        System.out.println(numero);

        linea = f.nextLine();
        System.out.println(linea);
        f.close();

    }
}
