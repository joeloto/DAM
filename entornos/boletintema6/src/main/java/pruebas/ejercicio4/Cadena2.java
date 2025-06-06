package pruebas.ejercicio4;

import java.util.ArrayList;

public class Cadena2 {
    private ArrayList<Character> cadena = new ArrayList<>();

    public void setCadena(String frase) {
        int inicio = 0;
        int fin = frase.length() - 1;
        while (inicio < frase.length() && frase.charAt(inicio) == ' ') {
            inicio++;
        }
        while (fin != 0 && frase.charAt(fin) == ' ') {
            fin--;
        }
        for (int i = inicio; i <= fin; i++) {
            cadena.add(frase.charAt(i));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null && obj.getClass() != Cadena2.class && obj.getClass() != String.class
                && obj.getClass() != char[].class) {
            throw new IllegalArgumentException("Parámetro inválido");
        }
        if (obj.getClass() == Cadena2.class) {
            Cadena2 comodin = (Cadena2) obj;
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

    public int eliminar(char caracter) {
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
