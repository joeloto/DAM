package programacion.POO.boletinPOO;

public class Enemigo {
    
    private String dificultad;
    private String especie;
    private String ataque;

    public String getDificultad(){
        return dificultad;
    }

    public void setDificultad(String dificultad){
        this.dificultad = dificultad;
    }

    public String getEspecie(){
        return especie;
    }

    public void setVidas(String especie){
        this.especie = especie;
    }

    public String getAtaque(){
        return ataque;
    }

    public void setAtaque(String ataque){
        this.ataque = ataque;
    }
}
