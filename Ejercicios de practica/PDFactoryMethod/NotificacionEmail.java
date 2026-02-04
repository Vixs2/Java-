package PDFactoryMethod;

public class NotificacionEmail implements Notificacion{

    //Sobreescritura del metodo de la interfaz Notificacion.
    @Override
    public void enviar(String mensaje) {
      System.out.println("Enviando email: " + mensaje);
    } 
}
