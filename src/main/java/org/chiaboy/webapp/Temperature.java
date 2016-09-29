package org.chiaboy.webapp;

public class Temperature {
    private String id;
    private String desc;
    private int temp;

    public Temperature(String id, String desc, int temp) {
        this.id = id;
        this.desc = desc;
        this.temp = temp;
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

    public int getTemp() {
        return temp;
    }


    public void setTemp(int newTemp) {
        this.temp = newTemp;
    }


    public String toString() {
        return "ID: " + id + "\nDescription: " + desc + "\nTemperature: " + temp;
    }
}
