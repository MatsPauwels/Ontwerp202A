package order;

import common.Position;
import person.Courier;
import person.DeliveryPointEvent;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:34
 */
public class OrderStateEvent {
    private LocalDateTime time;
    private OrderState state;
    private String remark;
    private Collection<Order> orders;
    private Courier courier;

    public OrderState getState() {
        return state;
    }
}
