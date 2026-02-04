package PDFactoryMethod;

public class EmailCreator extends NotificacionCreator{

    @Override
    public Notificacion crearNotificacion() {
       return new NotificacionEmail();
    }
}
