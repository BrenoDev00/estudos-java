package aprendizado.src.enums;

import java.time.LocalDate;

import aprendizado.src.enums.Order;
import aprendizado.src.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var order = new Order(1056, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
        OrderStatus status1 = OrderStatus.PENDING_PAYMENT;
        OrderStatus status2 = OrderStatus.valueOf("PENDING_PAYMENT");

        System.out.println(status1);
        System.out.println(status2);
        System.out.println("Data do pedido: " + order.getMoment());
    }
}
