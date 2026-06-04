package aprendizado.src.interfaces;

import aprendizado.src.interfaces.EmailService;
import aprendizado.src.interfaces.SMSService;

public class Main {
    public static void main(String[] args) {
        var emailService = new EmailService();
        emailService.notify("E-mail");

        var smsService = new SMSService();
        smsService.notify("SMS");
    }
}
