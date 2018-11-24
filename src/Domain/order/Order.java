package Domain.order;

import Domain.common.Address;

import java.util.ArrayList;
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
    private List<OrderLine> orderLines;
    private List<OrderStateEvent> orderStateEvents;

    public Order(int orderId, Address deliveryAddress, String deliveryInstructions, int averageDeliveryPoints) {
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
        this.deliveryInstructions = deliveryInstructions;
        this.averageDeliveryPoints = averageDeliveryPoints;
        orderLines = new ArrayList<>();
        orderStateEvents = new ArrayList<>();
    }

    public List<OrderStateEvent> getOrderStateEvents() {
        return orderStateEvents;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Id: " + orderId
                + "\nAdres: " + deliveryAddress
                + "\nADPoints: " + averageDeliveryPoints
                + "\nInstructies: " + deliveryInstructions
                + "\nEvents:");
        //StateEvents in enum volgorde:
        orderStateEvents.stream().sorted((ose1, ose2) -> (ose1.getState().ordinal() - ose2.getState().ordinal()))
                .forEach( ose -> str.append("\n\t").append(ose).append("\n"));

        return str.toString();
    }
}
