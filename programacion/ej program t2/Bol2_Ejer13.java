import java.util.Scanner;

public class Bol2_Ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acu1 = 0;
        int acu2 = 0;
        int acu3 = 0;
        int acu4 = 0;
        int num;
        
        System.out.println("Dame un número");
        num = sc.nextInt();

        for (int cont1 = 0; cont1<=num; cont1++){
            if (cont1 % 2 == 0){
                acu1 = acu1 + cont1;
                //System.out.println("La suma de los numeros pares entre 0 y " + num + " es " + acu1);
            }
        }
        System.out.println("La suma de los numeros pares entre 0 y " + num + " es " + acu1);
        System.out.println("----------------------------------------------------------------------");

        for (int cont2 = 0; cont2<=num; cont2++){
            if (cont2 % 2 != 0){
                acu2 = acu2 + cont2;
            }
        }
        System.out.println("La suma de los numeros impares entre 0 y " + num + " es " + acu2);
        System.out.println("----------------------------------------------------------------------");


        for (int cont3 = 0; cont3<=num; cont3++){
            if (cont3 % 2 != 0){
                acu3 = acu3 + cont3;
            } else { 
                acu4 = acu4 + cont3;  
            }
        }
        System.out.println("La suma de los numeros impares entre 0 y " + num + " es " + acu3);
        System.out.println("La suma de los numeros pares entre 0 y " + num + " es " + acu4);
            
    }
}
