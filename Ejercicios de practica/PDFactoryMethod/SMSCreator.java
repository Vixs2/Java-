package PDFactoryMethod;

public class SMSCreator extends NotificacionCreator{

    @Override
    public Notificacion crearNotificacion() {
      return new NotificacionSms();
    }
    
}
