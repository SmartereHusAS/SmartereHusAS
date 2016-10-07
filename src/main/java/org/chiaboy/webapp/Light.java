package org.chiaboy.webapp;

import javax.ws.rs.*;

public class Light {
    private String id;
    private String desc;
    private boolean on;
    private int wattage;

    public Light(String id, String desc, boolean on, int wattage){
        this.id = id;
        this.desc = desc;
        this.on = on;
        this.wattage = wattage;
    }

    public Light() {}

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean getState(){
        return on;
    }

    public void setState(boolean state){
        on = state;
    }

    public int getWattage(){
        return wattage;
    }

    public void setWattage(int watt){
        wattage = watt;
    }

    public String toString(){
        return "ID: " + id + "\nDescription: " + desc + "\nState: " + on + "\nWattage: " + wattage + "W";
    }

}
