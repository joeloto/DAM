import java.util.Scanner;
import java.io.*;

public class ejercicio7 {

    public static loadFile(String name){
        String a = name;
        Scanner f = new Scanner(new File (name));
        a = f.nextLine();
        f.close();
        return a;
    };

}
