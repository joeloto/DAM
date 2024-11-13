import java.util.Scanner;
import java.io.*;

public class ejercicio7 {
    static Scanner sc = new Scanner(System.in);

    /**
     * lee un archivo
     * 
     * @param name recoge el nombre del archivo
     * @return devuelve el contenido del archivo
     * @throws FileNotFoundException
     */
    public static String loadFile(String name) throws FileNotFoundException {
        Scanner f = new Scanner(new File(name));
        String a = "";
        while (f.hasNext()) {
            a = a + f.nextLine();
        }
        f.close();
        return a;
    }

    /**
     * lee un archivo y lo concatena con un texto que escribes
     * @param name recoge el nombre del archivo
     * @param text recoge el texto que escribes
     * @throws Exception
     */
    public static void appendFile(String name, String text) throws Exception {
        String b = loadFile(name);
        PrintWriter f = new PrintWriter("ejercicio2.txt");
        System.out.println();
        f.write(b+text);
        f.close();
    }

    /**
     * lee un archivo y lo concatena con un texto que escribes
     * @param name recoge el nombre del archivo
     * @param text recoge el texto que escribes
     * @throws Exception
     */
    public static void appendFile2(String name, String text) throws Exception{
        loadFile(name);
        PrintWriter f = new PrintWriter(new FileWriter(name));
        f.println(text);
        f.close();
    }

    public static void main(String[] args) throws Exception {
        // String nombre = loadFile("ejercicio2.txt");
        // System.out.println(nombre);

        System.out.println("Escribe lo que tú quieras");
        String text = sc.nextLine();
        String name = ("ejercicio2.txt");   
        appendFile2(name, text);
        //appendFile(name, text);
        System.out.println(loadFile(name));
    }
}
