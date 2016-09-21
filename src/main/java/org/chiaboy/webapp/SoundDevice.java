package org.chiaboy.webapp;
/**
 * Created by Magnusfn on 16.09.2016.
 */
public class SoundDevice {
    private int volume;

    public SoundDevice(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void mute(){
        volume = 0;
    }

    public String toString(){
        return "Volume: " + volume;
    }



}
