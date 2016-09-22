package org.chiaboy.webapp;

/**
 * Created by asdfLaptop on 16.09.2016.
 */
public class Temperature {
    private String id;
    private double floorTemp;
    private double ambientTemp;

    public Temperature(String id, double floorTemp, double ambientTemp) {
        this.id = id;
        this.floorTemp = floorTemp;
        this.ambientTemp = ambientTemp;
    }

    public Temperature() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFloorTemp() {
        return floorTemp;
    }

    public double getAmbientTemp() {
        return ambientTemp;
    }

    public void setFloorTemp(double newTemp) {
        floorTemp = newTemp;
    }

    public void setAmbientTemp(double newTemp) {
        ambientTemp = newTemp;
    }

    public String toString() {
        return "Floor temperature: " + floorTemp + "\n Ambient temperature: " + ambientTemp;
    }
}
