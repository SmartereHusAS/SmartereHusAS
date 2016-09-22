package org.chiaboy.webapp;

/**
 * Created by Magnusfn on 16.09.2016.
 */

public class SoundDevice {
    private String id;
    private String volume;

    public SoundDevice(String id, String volume) {
        this.id = id;
        this.volume = volume;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume){
        this.volume = volume;
    }

    public void mute(){
        volume = "0";
    }

    public String toString(){
        return "Volume: " + volume;
    }



}
