package aprendizado.src.interfaces;

import aprendizado.src.interfaces.NotificationInterface;

public class EmailService implements NotificationInterface {
    public EmailService() {
    }

    public void notify(String message) {
        System.out.println("Serviço de " + message);
    }
}