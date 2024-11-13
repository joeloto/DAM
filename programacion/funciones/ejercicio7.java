import java.util.Scanner;
import java.io.*;

public class ejercicio7 {

    /**
     * lee un archivo
     * @param name recoge el nombre del archivo
     * @return devuelve el contenido del archivo
     * @throws FileNotFoundException
     */
    public static String loadFile(String name) throws FileNotFoundException{
        Scanner f = new Scanner(new File (name));
        String a = "";
        while (f.hasNext()) {
             a = f.nextLine();
        }
        return a;
    }

    public static void appendFile(String name, String text) throws FileNotFoundException{
        loadFile(name);
        

    }

    public static void main(String[] args) throws FileNotFoundException {
        String nombre = loadFile("ejercicio2.txt");
        System.out.println(nombre);
    }


}
