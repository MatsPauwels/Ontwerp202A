package person;

import common.Address;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joseph Assayag
 * @version 1.0 18/11/2018 13:24
 */
public class Customer extends Person {
    private List<Address> deliveryAddresses;

    public Customer(Address deliveryAddress) {
        deliveryAddresses = new ArrayList<>();
        this.deliveryAddresses.add(deliveryAddress);
    }
}

// customer moet minstens 1 afleveradres hebben, wordt via constructor verplicht gemaakt
