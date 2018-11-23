package restaurant;

import payment.Money;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:40
 */
public class Dish {
    private String name;
    private String description;
    private Money price;
    private int productionTime;
    private int maximumDeliveryTime;
    private Allergen[] allergens;

    private Restaurant restaurant;


    public int getMaximumDeliveryTime() {
        return maximumDeliveryTime;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
