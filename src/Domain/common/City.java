package Domain.common;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:48
 */
public class City {
    private String postalCode;
    private String name;

    public City(String postalCode, String name) {
        this.postalCode = postalCode;
        this.name = name;
    }

    @Override
    public String toString() {
        return postalCode + " " + name.toUpperCase();
    }
}
