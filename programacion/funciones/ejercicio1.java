

import java.util.Scanner;

public class ejercicio1 {

    Scanner sc = new Scanner(System.in);

    public static void lineasblanco(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println();
        System.out.println();
        System.out.println(" ¿Cuántas líneas en blanco quieres poner?");
        n = sc.nextInt();
        lineasblanco(n);



    }

}

