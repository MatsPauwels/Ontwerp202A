package UI;

import BL.OrderController;

public class Main {

    public static void main(String[] args) {
        OrderController orderController = new OrderController();

        for (Object order: orderController.geefBeschikbareLeveringen()
             ) {
            System.out.println(order);
        }
    }
}
