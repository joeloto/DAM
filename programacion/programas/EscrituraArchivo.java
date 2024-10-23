import java.io.PrintWriter;

public class EscrituraArchivo {
    public static void main(String[] args) throws Exception {
        // Apertura
        PrintWriter f = new PrintWriter("prueba.txt");

        // Escritura
        f.print("Prueba de archivos. ");
        f.printf("%5.2f\n", Math.PI);

        // Cierre
        f.close();
    }
}
