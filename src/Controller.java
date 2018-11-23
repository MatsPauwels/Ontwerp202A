import common.Position;
import order.Order;

import java.util.List;

public class Controller {
    private int id;
    private OrderManager orderManager;
    private Selector selector;

    public List<Order> geefBeschikbareLeveringen(Position position) {
        List<Order> openOrders = orderManager.getOpenOrders();
        return selector.StandaardSelectie(openOrders);
    }
}
