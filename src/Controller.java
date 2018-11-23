import common.Position;
import order.Order;
import order.OrderState;
import order.OrderStateEvent;
import person.Courier;

import java.util.List;

public class Controller {
    private int id;
    private OrderCataloog orderCataloog;
    private Selector selector;

    public List<Order> geefBeschikbareLeveringen(Position position) {
        List<Order> openOrders = orderCataloog.getOpenOrders();
        return selector.StandaardSelectie(openOrders);
    }
}
