// a) Haz una función llamada loadFile a la cual se le pasa una cadena que
// representa el nombre de un archivo. Dicha función debe leer un archivo completo y
// devolverlo como string.
// Para probarla en el main usa el archivo del ejercicio 2.

// b) Realiza una función denominada appendFile a la que se le pasan dos cadenas, la
// primera es el nombre de un archivo y la segunda es un texto que debe añadir al
// final del archivo. Para ello primero lee el archivo, concatena la nueva cadenas y lo
// guarda de nuevo. Utiliza la función creada en (a) para la lectura.

// c) Realiza una función denominada appendFile2 que hace lo mismo que la realizada
// en (b) pero usando el método explicado en el Apéndice II de los apuntes.


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
