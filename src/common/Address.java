package common;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:50
 */
public class Address {
    private City city;
    private String straat;
    private String nummer;
    private Position position;
    private String country;

    public Position getPosition() {
        return position;
    }

    public String getCountry() {
        return country;
    }
}
