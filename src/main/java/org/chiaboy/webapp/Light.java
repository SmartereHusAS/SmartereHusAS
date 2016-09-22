package org.chiaboy.webapp;

import javax.ws.rs.*;

/**
 * Created by KristofferLaptop on 16-Sep-16.
 */
public class Light {
    private String id;
    private boolean on;
    private String value;

    public Light(String id, boolean on, String value){
        this.id = id;
        this.on = on;
        this.value = value;
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

    public void setWattage(String value){
        this.value = value;
    }

    public String getWattage(){
        return value;
    }

    public String toString(){
        return "ID: " + id + " State: " + on + " Value: " + value + "W";
    }

}
