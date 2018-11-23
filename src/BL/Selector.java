package BL;

import Domain.order.Order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Selector {

//    Geeft recentse 3 orders
    static List<Order> StandaardSelectie(List<Order> openOrders){
        List<Order> beschikbareOrders = new ArrayList<>();
        openOrders.sort(Comparator.comparing(Order::getOrderId));
        for (int i = 0; i < 3; i++) {
            beschikbareOrders.add(openOrders.get(i));
        }
        return beschikbareOrders;
    }
}
