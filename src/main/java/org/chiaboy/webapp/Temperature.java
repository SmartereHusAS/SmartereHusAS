package org.chiaboy.webapp;

public class Temperature {
    private String id;
    private String desc;
    private double floorTemp;
    private double ambientTemp;

    public Temperature(String id, String desc, double floorTemp, double ambientTemp) {
        this.id = id;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
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
        return "ID: " + id + "\nDescription: " + desc + "\nFloor temperature: " + floorTemp + "\nAmbient temperature: " + ambientTemp;
    }
}
