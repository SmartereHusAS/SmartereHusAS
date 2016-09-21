package org.chiaboy.webapp; /**
 * Created by Magnusfn on 16.09.2016.
 */
public class SoundDevice {
    private String soundDeviceId;
    private int volume;

    public SoundDevice(String soundDeviceId, int volume) {
        this.soundDeviceId = soundDeviceId;
        this.volume = volume;
    }

    public SoundDevice() {}

    public void setVolume(int volume){
        this.volume = volume;
    }

}
