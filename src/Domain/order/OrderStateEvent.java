package Domain.order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:34
 */
public class OrderStateEvent {
    private LocalDateTime time;
    private OrderState state;
    private String remark;

    public OrderStateEvent(LocalDateTime time, OrderState state, String remark) {
        this.time = time;
        this.state = state;
        this.remark = remark;
    }

    public OrderState getState() {
        return state;
    }



    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("%s: %s (%s)",state.name(),time.format(dateTimeFormatter),remark);
    }
}
