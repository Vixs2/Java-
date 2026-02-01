import java.io.BufferedReader;
import java.io.InputStreamReader;

public class arroz {
public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        String texto = teclado.readLine();
        int texto2 = Integer.parseInt(teclado.readLine());
        System.out.println("Cadena: " + texto);
        System.out.println("Cadena 2: " + texto2);
    }
}
