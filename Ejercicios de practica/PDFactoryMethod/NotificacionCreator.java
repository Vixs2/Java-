package PDFactoryMethod;

//Definida como clase abstracta.
public abstract class NotificacionCreator {
    
    //Factory Method (Se inicializa el metodo).
    public abstract Notificacion crearNotificacion();

    public void enviar(String mensaje){
        Notificacion miNotificacion = crearNotificacion();
        miNotificacion.enviar(mensaje);
    }
}
