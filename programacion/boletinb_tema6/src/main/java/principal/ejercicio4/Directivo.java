package principal.ejercicio4;



public class Directivo {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String departamento;
    private double beneficios;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDepartamento(){
        return "\"" + departamento+ "\"";
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento.toUpperCase() ;
    }

    public double getBeneficios(){
        return beneficios;
    }

    public void setBeneficios(double beneficios){
        this.beneficios = beneficios;
        if (beneficios >= 0 && beneficios <= 100) {
            this.beneficios = beneficios;
        } else{
            beneficios = 0;
        }
    }

    public Directivo(){
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.dni = "";
        this.departamento = "";
        this.beneficios = 0;
    }

    public Directivo(String nombre, String apellidos, int edad, String dni, String departamento, double beneficios){
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
        setDepartamento(departamento);
        setBeneficios(beneficios);
    }

    public double beneficioTotal(double beneficioEmpresa){
        beneficioEmpresa = 200000;
        if (beneficioEmpresa < 0) {
            return 0;
        }
        return (beneficioEmpresa * beneficios)/100;
    }

    
}
