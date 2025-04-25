package principal.ejercicio3;

import java.util.ArrayList;

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
        if (obj.getClass() == Cadena.class && obj.equals(cadena)){
            return true;
        }
        if (obj == null ){

        }
        
    }
}
