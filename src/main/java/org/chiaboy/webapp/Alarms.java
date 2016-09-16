
package org.chiaboy.webapp;import java.util.Date;

/**
 * Created by Magnusfn on 16.09.2016.
 */
public class Alarms {
    private static int alarmVolume;
    private static Date time;
    private static boolean isOn;

    public Alarms (Date time){
        this.time = time;
    }

    public int getAlarmVolume(){
        return 75;
    }

    public void setAlarmVolume(int newVolume){
        alarmVolume = newVolume;
    }



}