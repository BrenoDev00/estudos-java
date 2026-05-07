package aprendizado.src.enums;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import aprendizado.src.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private LocalDate moment;
    private OrderStatus status;

    Order(Integer id, LocalDate moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public String getMoment() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.moment.format(dateFormat);
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return this.status;
    }
}
