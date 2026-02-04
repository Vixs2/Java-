package PatronesDeDiseño;

public class ConfigurationE {

    //Atributos propios.
    public String urlBaseDeDatos;
    public int puerto;
    public int nombreEntorno;
    

    //Variable estatica de instancia.
    public static ConfigurationE instancia;


    //Constructor privado
    private ConfigurationE(){

    }

    //Metodo que valida si la instancia existe o no existe.
    public static ConfigurationE getInstance(){
        if(instancia == null){
            instancia = new ConfigurationE();
        }
        return instancia;
    }

    public String getUrlBaseDeDatos() {
        return urlBaseDeDatos;
    }

    public void setUrlBaseDeDatos(String urlBaseDeDatos) {
        this.urlBaseDeDatos = urlBaseDeDatos;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public int getNombreEntorno() {
        return nombreEntorno;
    }

    public void setNombreEntorno(int nombreEntorno) {
        this.nombreEntorno = nombreEntorno;
    }
}
