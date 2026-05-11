

public class Ejercicios {

    record Estudiante(String nombre, double nota) {}

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String[] palabras = {"uno", "dos", "tres"};

        for (int i = 0; i < palabras.length; i++) {
            if(i < palabras.length -1){
                sb.append(palabras[i].toUpperCase()).append(" ");
            } else {
                sb.append(palabras[i].toUpperCase());
            }
        }

        System.out.println(sb.toString());
    }
}