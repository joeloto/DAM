import java.util.Scanner;
public class basico {
    public static void main (String args[]) {

    String nombre;
    String direccion;
    int edad;
    Scanner sc = new Scanner(System.in);    

System.out.println("Bienvendos a mi superprograma v1.0");
System.out.println("Ahora unas preguntas");
System.out.println("Dime tu nombre: ");
nombre = sc.nextLine ();
System.out.println("Dime tu direccion: ");
direccion = sc.nextLine ();
System.out.println("Dime tu edad: ");
edad = sc.nextInt();
System.out.println("Te llamas " + nombre +" vives en " + direccion + " y tienes " + edad + " años.");



    }
}