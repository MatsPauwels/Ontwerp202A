package person;

import common.Position;
import order.Order;
import order.OrderState;

import java.util.Collection;
import java.util.List;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:33
 */
public class Courier extends Person{
    private boolean isAvailable;
    private Position position;
    private Partner partner;
    private List<DeliveryPointEvent> deliveryPointEvents;
    private Collection<Order> orders;

    public Position getPosition() {
        return position;
    }




}
