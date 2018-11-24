package BL;

import Domain.order.Order;

import java.util.List;

public class OrderController {
    private OrderManager orderManager;

    public OrderController() {
        this.orderManager = new OrderManager();
    }

    // Returnt beschikbare leveringen volgens selectie algoritme
    public List<Order> geefBeschikbareLeveringen() {
        List<Order> openOrders = orderManager.getOpenOrders();
        return Selector.getStandaardSelectie(openOrders);
    }
}

