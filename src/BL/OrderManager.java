package BL;

import Domain.common.Address;
import Domain.common.City;
import Domain.order.Order;
import Domain.order.OrderState;
import Domain.order.OrderStateEvent;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class OrderManager {
    private List<Order> orders;

    OrderManager()
    {
        seedOrders(); // vul orders met open en gesloten dummy orders
    }

    // getOpenOrders() returnt orders die nog niet aangenomen zijn door een courier
    List<Order> getOpenOrders() {
        List<Order> openOrders = new ArrayList<>();
        for (Order order : orders) {
            List<OrderStateEvent> orderStateEvents = order.getOrderStateEvents();
//            een order heeft meerder stateEvents (1 op veel, check domeinmodel in opgave pagina 18)
//            test1: is er een ORDER_PLACED event aanwezig in de List?
            if (orderStateEvents.stream()
                    .anyMatch(ose -> ose.getState().equals(OrderState.ORDER_PLACED))
//            test 2: en is het de enige event in de list?
                    && orderStateEvents.size() == 1) {
                openOrders.add(order);
            }
        }
        return openOrders;
    }

    private void seedOrders(){
        orders = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            // maak nieuwe order
            Order newOrder = new Order(i,new Address(new City(i+"000","Stad"+i),
                    "Straat"+i,"1"+i,"België"),"instructies van klant",new Random().nextInt(9)+1);
            // maak van de order een openstaande order (1 OrderStateEvent met OrderState.ORDER_PLACED)
            newOrder.getOrderStateEvents().add(new OrderStateEvent(LocalDateTime.now().plusMinutes(-100+i*10),OrderState.ORDER_PLACED,"opmerking over bestelling"));
            // maak orders 1 en 2 niet meer openstaand
            if (i < 3){
                newOrder.getOrderStateEvents().add(new OrderStateEvent(LocalDateTime.now().plusMinutes(i+1),OrderState.ACCEPTED_BY_COURIER,"opmerking over aanvaarding"));
            }
            // voeg nieuw order toe aan orders
            orders.add(newOrder);
        }
    }
}
