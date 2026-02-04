package PDFactoryMethod;

public class MainNotificacion {
    public static void main(String[] args) {
        
        Notificacion notificacionEmail = new NotificacionEmail();
        notificacionEmail.enviar("paga ahora tus paquete de datos o si no deberemos cancelar su suscripcion.");

        Notificacion notificacionSMS = new NotificacionSms();
        notificacionSMS.enviar("Pague ahora su paquete de datos movistar....");
    }
}
