package BL;

import Domain.order.Order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

final class Selector {

    private Selector() { // private constructor: Selector is niet instantieerbaar
    }

    //    getStandaardSelectie() returnt de 3 orders met de kleinste orderId's in openOrders
    static List<Order> getStandaardSelectie(List<Order> openOrders){
        List<Order> StandaardSelectieOrders = new ArrayList<>();
        openOrders.sort(Comparator.comparing(Order::getOrderId));
        for (int i = 0; i < 3; i++) {
            StandaardSelectieOrders.add(openOrders.get(i));
        }
        return StandaardSelectieOrders;
    }
}
