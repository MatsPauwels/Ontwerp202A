package Domain.order;

import Domain.restaurant.Dish;
import Domain.restaurant.Restaurant;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:35
 */


public class OrderLine {
    private int quantity;
    private String remark;
    private Restaurant restaurant;
    private Dish dish;
    private Order order;
}
