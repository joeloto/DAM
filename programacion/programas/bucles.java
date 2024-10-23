public class bucles {

    public static void main(String[] args) {
        
        int cont = 1;
        int acu = 0;    

        while(cont<=10){
            System.out.println("Cont: " + cont);
            acu = acu + cont;
            cont = cont + 1;
            //cont++ es igaul a cont = cont + 1
            System.out.println("La suma de numeros es " + acu);
        }
    }
}