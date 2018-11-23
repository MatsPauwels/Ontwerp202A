package common;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:48
 */
public class Position {
    private float longtitude;
    private float latitude;

    public Position(float longtitude, float latitude) {
        this.longtitude = longtitude;
        this.latitude = latitude;
    }


    public float getLongtitude() {
        return longtitude;
    }

    public float getLatitude() {
        return latitude;
    }
}
