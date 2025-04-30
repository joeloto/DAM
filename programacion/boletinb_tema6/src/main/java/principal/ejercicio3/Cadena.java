package principal.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class Cadena {
    private ArrayList<Character> cadena = new ArrayList<>();

    public void setCadena(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            cadena.add(frase.trim().charAt(i));
        }
    }

    @Override
    public String toString() {
        return cadena.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null && obj.getClass() != Cadena.class && obj.getClass() != String.class && obj.getClass() != char[].class) {
            throw new IllegalArgumentException("Parámetro inválido");
        }
        if (obj.getClass() == Cadena.class) {
            Cadena comodin = (Cadena) obj;
            if (cadena.size() != comodin.cadena.size()) {
                return false;
            }
            for (int i = 0; i < cadena.size(); i++) {
                if (!cadena.get(i).equals(comodin.cadena.get(i))) {
                    return false;
                }
            }
            return true;
        }
        if (obj.getClass() == String.class && obj.equals(cadena)) {
            return true;
        }
        if (obj.getClass() == char[].class) {
            char[] comodin = (char[]) obj;
            if (cadena.size() != comodin.length) {
                return false;
            }
            for (int i = 0; i < cadena.size(); i++) {
                if (!cadena.get(i).equals(comodin[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int eliminar(char caracter){
        int eliminaciones = 0;
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.get(i) == caracter) {
                cadena.remove(i);
                eliminaciones++;
                i--;
            }
        }
        return eliminaciones;
    }   
}
