//a)Codificar un programa que genere una quiniela aleatoria. Es decir, se deben
// dar 14 resultados aleatorios como 1, X ó 2 indicando delante el número de partido
// y los resultados alineados en una columna (no uses \t, si no ajuste con printf ). Se
// debe realizar al menos una función que devuelva un 1 una X o un 2 (char o String)
// aleatorio

public class ejercicio12 {

    public static String quiniela() {
        int resultado = (int) (Math.random() * 3 + 1);
        switch (resultado) {
            case 1:
                return "1";
            case 2:
                return "X";
            case 3:
                return "2";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        String resultado = quiniela();
        System.out.println("Quiniela aleatoria");
        System.out.println("-------------------");
        for (int partidos = 1; partidos <= 14; partidos++) {
            System.out.printf("Partido %d | %5s", partidos, resultado);
        }
            
        }
    }

