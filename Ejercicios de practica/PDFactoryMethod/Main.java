package PDFactoryMethod;

public class Main {
    
    public static void main(String[] args) {
        
        EnvioCreator envioMoto = new EnvioMotoCreator();
        envioMoto.procesarEnvio();

        EnvioCreator envioCamion = new EnvioCamionCreator();
        envioCamion.procesarEnvio();

    }
}
