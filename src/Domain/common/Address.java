package Domain.common;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:50
 */
public class Address {
    private City city;
    private String street;
    private String number;
    private Position position;
    private String country;

    public Address(City city, String street, String number, String country) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s %s",street,number,city,country);
    }
}
