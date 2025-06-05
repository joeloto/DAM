package principal.ejercicio4;



public class Directivo extends Persona {
    private String departamento;
    private double beneficios;

    
    public Directivo(String nombre, String apellidos, int edad, String dni, String departamento, double beneficios) {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
        setDepartamento(departamento);
        setBeneficios(beneficios);
    }
    
    public Directivo() {
        this("", "", 0, "", "", 0);
    }

    public String getDepartamento() {
        return "\"" + departamento+ "\"";
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento.toUpperCase();
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        if (beneficios >= 0 && beneficios <= 100) {
            this.beneficios = beneficios;
        } else {
            this.beneficios = 0;
        }
    }

    public double beneficioTotal(double beneficioEmpresa) {
        if (beneficioEmpresa < 0) {
            return 0;
        }
        return beneficioEmpresa * beneficios / 100;
    }

    @Override
    public String firmaMail() {
        return getNombre() + " " + getApellidos() + departamento;
    }
}
