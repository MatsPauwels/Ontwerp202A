package order;

import common.Address;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:57
 */
public class Order {
    private int orderId;
    private Address deliveryAddress;
    private String deliveryInstructions;
    private int averageDeliveryPoints;
    private OrderStateEvent orderStateEvent;


    public OrderStateEvent getOrderStateEvent() {
        return orderStateEvent;
    }

    public int getOrderId() {
        return orderId;
    }
}
