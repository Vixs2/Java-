package PDFactoryMethod;

public class NotificacionSms implements Notificacion{

    //Sobreescritura del metodo de la interfaz.
    @Override
    public void enviar(String mensaje) {
       System.out.println("Enviando SMS: " + mensaje);
    }
}
