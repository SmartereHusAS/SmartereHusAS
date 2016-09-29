package org.chiaboy.webapp;

public class SoundDevice {
    private String id;
    private String desc;
    private String volume;

    public SoundDevice(String id, String desc, String volume) {
        this.id = id;
        this.desc = desc;
        this.volume = volume;
    }

    public SoundDevice() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume){
        this.volume = volume;
    }

    public String toString() {
        return "ID: " + id + "\nDescription: " + desc + "\nVolume: " + volume;
    }

}
