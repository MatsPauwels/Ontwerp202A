package BL;

import Domain.order.Order;
import Domain.order.OrderState;
import Domain.order.OrderStateEvent;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;


    public List<Order> getOpenOrders() {
        List<Order> openOrders = new ArrayList<>();

        for (Order order : orders) {
            List<OrderStateEvent> orderStateEvents = order.getOrderStateEvents();

//            een order heeft meerder stateEvents (1 op veel, check domeinmodel in opgave pagina 18)
//            geldige test: OrderState.ORDER_PLACED moet in de lijst de enige orderStateEvent zijn

//            is er een ORDER_PLACED event aanwezig in de List?
            if (orderStateEvents.stream()
                    .anyMatch(ose -> ose.getState().equals(OrderState.ORDER_PLACED))
//            en is het de enige event in de list?
                    && orderStateEvents.size() == 1) {
                openOrders.add(order);
            }
        }
        return openOrders;
    }
}
