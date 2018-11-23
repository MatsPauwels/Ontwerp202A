package Domain.order;

import Domain.common.Address;

import java.util.List;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:57
 */
public class Order {
    private int orderId;
    private Address deliveryAddress;
    private String deliveryInstructions;
    private int averageDeliveryPoints;
    private List<OrderStateEvent> orderStateEvents;

    public List<OrderStateEvent> getOrderStateEvents() {
        return orderStateEvents;
    }

    public int getOrderId() {
        return orderId;
    }
}
