package principal.ejercicio4;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String dni;

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
        String letraDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dniLimpio = dni.replace("-", "").toUpperCase();

        if (dniLimpio.length() != 9) {
            throw new DNIException("El DNI debe tener 9 caracteres.");
        }

        String numStr = dniLimpio.substring(0, 8);
        char letra = dniLimpio.charAt(8);

        try {
            int num = Integer.parseInt(numStr);
            char letraCorrecta = letraDni.charAt(num % 23);
            if (letra != letraCorrecta) {
                throw new DNIException("La letra del DNI no es correcta.");
            }
        } catch (NumberFormatException e) {
            throw new DNIException("Los primeros 8 caracteres del DNI deben ser numéricos.");
        }

        this.dni = dniLimpio;
    }

    public abstract String firmaMail();

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}

