package org.chiaboy.webapp;

import javax.ws.rs.*;

/**
 * Created by KristofferLaptop on 16-Sep-16.
 */
public class Light {
    private String id;
    private boolean on;
    private int wattage;

    public Light(String id, boolean on, int wattage){
        this.id = id;
        this.on = on;
        this.wattage = wattage;
    }

    public Light() {}

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setState(boolean state){
        on = state;
    }

    public boolean getState(){
        return on;
    }

    public void setWattage(int watt){
        wattage = watt;
    }

    public int getWattage(){
        return wattage;
    }

    public String toString(){
        return "ID: " + id + " State: " + on + " Wattage: " + wattage + "W";
    }

}
