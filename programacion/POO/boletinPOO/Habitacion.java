package programacion.POO.boletinPOO;

public class Habitacion {
    
    private Habitacion norte;
    private Habitacion sur;
    private Habitacion este;
    private Habitacion oeste;


    private String objeto1;
    private String tipoHabitacion;
    private Enemigo enemigo;
    private Protagonista protagonista;

    public Habitacion getNorte() {
        return norte;
    }
    
    public void setNorte(Habitacion norte) {
        this.norte = norte;
    }
    
    public Habitacion getSur() {
        return sur;
    }
    
    public void setSur(Habitacion sur) {
        this.sur = sur;
    }
    
    public Habitacion getEste() {
        return este;
    }
    
    public void setEste(Habitacion este) {
        this.este = este;
    }
    
    public Habitacion getOeste() {
        return oeste;
    }
    
    public void setOeste(Habitacion oeste) {
        this.oeste = oeste;
    }
    
    public String getObjeto1() {
        return objeto1;
    }
    
    public void setObjeto1(String objeto1) {
        this.objeto1 = objeto1;
    }
    
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
    
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }





}
