package factory;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sms sent: " + message);
    }
}
