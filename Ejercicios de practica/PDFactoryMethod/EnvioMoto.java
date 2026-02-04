package PDFactoryMethod;

public class EnvioMoto implements Envio{

    @Override
    public void enviarPaquete() {
        System.out.println("Enviando paquete por medio de moto...");
    }
    
}
