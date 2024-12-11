package programacion.POO.boletinPOO;

public class PrincipalFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        Fecha f = new Fecha(10,21,2022);

        System.out.println(fecha.fechaFormateada(false));
        System.out.println(fecha.fechaFormateada(true));
        System.out.println();
        System.out.println(f.fechaFormateada(false));
        System.out.println(f.fechaFormateada(true));
        System.out.println();
        System.out.println("La diferencia entre años es " + Fecha.DifYear(f,fecha));
        
    }
    

    


}
