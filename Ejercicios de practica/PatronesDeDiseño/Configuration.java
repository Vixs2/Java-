package PatronesDeDiseño;   // o el nombre exacto que pusiste (sensible a mayúsculas)

public class Configuration {
    
    //1. variable statica
    private static Configuration instancia;

    //2. Constructor privado
    private Configuration(){
        System.out.println("Inicializando sistema");
    }

    //3. Metodo que crea o obtine la instancia
    public static Configuration getInstancia(){
        if(instancia == null){
            instancia = new Configuration();
        }
        return instancia;
    }

    public void mostrarMensaje(){
        System.out.println("Configuracion activa");
    }
}
