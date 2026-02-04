package PatronesDeDiseño;

public class MainE {
    public static void main(String[] args) {
        
        //Metodo inicial que crearia la instancia si no existe.
        ConfigurationE config1 = ConfigurationE.getInstance();
        
        ConfigurationE config2 = ConfigurationE.getInstance();

        System.out.println(config1 == config2); // Debería imprimir: true
    }
}
