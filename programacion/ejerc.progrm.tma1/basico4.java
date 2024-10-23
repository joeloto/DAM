import java.util.Scanner;
public class basico4 {
    public static void main (String args[]) {

    String nombre;
    String apellidos;
    int edad;
    Scanner sc = new Scanner(System.in);

    nombre = sc.nextLine();
    apellidos= sc.nextLine();
    edad = sc.nextInt();
    System.out.println(nombre + "\n\t" + apellidos + "\n\t\t\"" +  edad +"\"");
    }
}    
