package programacion.POO.boletinPOO.ZORK;

public class Protagonista {
    
    private String nombre;
    private int arma;
    private int vidas;
    private String magia;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getArma(){
        return arma;
    }

    public void setArma(int arma){
        this.arma = arma;
    }

    public int getVidas(){
        return vidas;
    }

    public void setVidas(int vidas){
        this.vidas = vidas;
    }

    public String getMagia(){
        return magia;
    }

    public void setMagia(String magia){
        this.magia = magia;
    }

    public Protagonista(){
        this.nombre = "";
        this.arma = 0;
        this.magia = "";
        this.vidas = 0;
    }

    public Protagonista(String nombre, int arma, String magia, int vidas){
        setNombre(nombre);
        setArma(arma);
        setMagia(magia);
        setVidas(vidas);
    }

    public String atacar(){
        String combate = "";
        if (arma >= 50) {
            combate = "Has derrotado al enemigo";
        } else {
            combate = "Has sido derrotado por el enemigo";
        }
        return combate;
    }

    public String vida(){
        String vivir = "";
        if (vidas == 0) {
            vivir ="HAS MUERTO";
        } else{
            vivir = "Sigues vivo!";
        }
        return vivir;
    }

    

}
