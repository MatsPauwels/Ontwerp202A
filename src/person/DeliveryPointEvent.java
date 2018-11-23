package person;

import order.EventType;
import order.OrderStateEvent;

import java.time.LocalDateTime;

/**
 * @author Joseph Assayag
 * @version 1.0 18/11/2018 13:57
 */
public class DeliveryPointEvent {
    private LocalDateTime time;
    private int points;
    private EventType eventType;

    private Courier courier;
    private OrderStateEvent orderStateEvent;  // NULLABLE
}
