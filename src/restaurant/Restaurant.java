package restaurant;

import common.ContactInfo;
import person.Partner;

import java.util.List;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:36
 */
public class Restaurant {
    private String name;
    private ContactInfo contactInfo;

    private List<OpeningPeriod> openingPeriods;
    private List<Dish> dishes;
    private Partner partner;

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
