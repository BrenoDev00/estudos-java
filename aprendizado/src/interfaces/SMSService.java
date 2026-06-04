package aprendizado.src.interfaces;

import aprendizado.src.interfaces.NotificationInterface;

public class SMSService implements NotificationInterface {
    public SMSService() {
    }

    public void notify(String message) {
        System.out.println("Serviço de " + message);
    }
}
