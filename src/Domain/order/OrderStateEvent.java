package Domain.order;

import Domain.person.Courier;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:34
 */
public class OrderStateEvent {
    private LocalDateTime time;
    private OrderState state;
    private String remark;
    public OrderState getState() {
        return state;
    }
}
