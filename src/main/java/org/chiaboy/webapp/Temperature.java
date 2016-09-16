package org.chiaboy.webapp;

/**
 * Created by asdfLaptop on 16.09.2016.
 */
public class Temperature {
    private double floorTemp;
    private double ambientTemp;

    public Temperature(double floorTemp, double ambientTemp) {
        this.floorTemp = floorTemp;
        this.ambientTemp = ambientTemp;
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
