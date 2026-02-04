package PDFactoryMethod;

public abstract class EnvioCreator {
    
    //factory method
    protected abstract Envio crearEnvio();

    //Logica comun que tienen todos los envios.
    public void procesarEnvio(){
        Envio envio = crearEnvio(); 
        envio.enviarPaquete();
    }
}
