package PatronesDeDiseño;   // o el nombre exacto que pusiste (sensible a mayúsculas)

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Modulo de autenticacion");
        Configuration config1 = Configuration.getInstancia();
        config1.mostrarMensaje();

        System.out.println("Modulo de reportes");
        Configuration config2 = Configuration.getInstancia();
        config2.mostrarMensaje();

        System.out.println("Comprobacion");
        System.out.println("son iguales?" + (config1 == config2));
        System.out.println("Config1: " + config1);
        System.out.println("Config2: " + config2);
    }
}
