package BL;

import Domain.order.Order;

import java.util.List;

public class OrderController {
    private int id;
    private OrderManager orderManager;

    // Geeft beschikbare leveringen volgens selectie algoritme
    public List<Order> geefBeschikbareLeveringen() {
        List<Order> openOrders = orderManager.getOpenOrders();
        return Selector.StandaardSelectie(openOrders);
    }
}
