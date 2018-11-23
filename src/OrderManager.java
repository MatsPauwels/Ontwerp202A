import order.Order;
import order.OrderState;
import order.OrderStateEvent;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;


    public List<Order> getOpenOrders(){
        List<Order> openOrders = new ArrayList<>();

        for (Order order:orders) {
            OrderStateEvent orderStateEvent = order.getOrderStateEvent();
            if (orderStateEvent.getState() == OrderState.ORDER_PLACED){
                openOrders.add(order);
            }
        }
        return openOrders;
    }


}
