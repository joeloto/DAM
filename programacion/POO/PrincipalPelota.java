package programacion.POO;

public class PrincipalPelota {

    public static void intercambiaRadios(Pelota p1, Pelota p2){
        double ab = p1.getRadio();
        p1.setRadio(p2.getRadio());
        p2.setRadio(ab);

    }

    public static void main(String[] args) {
        
        Pelota pelota = new Pelota();
        pelota.tipo = "baloncesto";
        pelota.setRadio(20);
        Pelota p = new Pelota();
        Pelota pp = new Pelota("futbol", 22);

        // pelota.tipo = "baloncesto";
        // pelota.radio = 20;

        System.out.printf("p de %s y de %.0f cm de radio.\n", p.tipo, p.getRadio());
        System.out.printf("pp de %s y de %.0f cm de radio.\n", pp.tipo, pp.getRadio());
        pelota.inflar();
       // pelota.inflar(10);
       // p.inflar();
        p.inflar(10);
        
        System.out.printf("pelota de %s y de %.0f cm de radio.\n", pelota.tipo, pelota.getRadio());
        System.out.printf("p de %s y de %.0f cm de radio.\n", p.tipo, p.getRadio());
        

        intercambiaRadios(pelota, p);
        System.out.printf("pelota de %s y de %.0f cm de radio.\n", pelota.tipo, pelota.getRadio());
        System.out.printf("p de %s y de %.0f cm de radio.\n", p.tipo, p.getRadio());
    }
}
