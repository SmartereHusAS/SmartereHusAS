
package org.chiaboy.webapp;

import org.joda.time.DateTime;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Magnusfn on 16.09.2016.
 */
public class Alarms extends Thread {
    private static int alarmVolume;
    private static Date time;
    private static boolean isOn;
    private static HashMap<String,Alarm> alarms = new HashMap<String,Alarm>();


    public void run() {

        boolean flag = true;
        while (flag) {
            for (Map.Entry<String, Alarm> entry : alarms.entrySet()) { //blar gjennom alarmer
                Alarm alarm = entry.getValue();
                if (alarm.isOn() && alarm.getAlarmTime().getMillis() < new DateTime().getMillis()) { //sjekker om alarm skal gå av
                    alarm.goOff();
                    try {
                        this.wait(1000 * 60);
                        alarm.addAlarmTime(5); //
                    } catch (InterruptedException ie) {
                        alarm.shutDown();
                        alarm.setIsOn(false);
                    }


                }

                // do what you have to do here
                // In your case, an other loop.
            }
            try {
                sleep(1000 * 60);
            }
            catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }

    }
    @POST
    @Path("/check_alarms")
    private void startThread(){
        start();
    }
    @POST
    @Path("/interrupt")
    public void interruptAlarm(){
        interrupt();
    }
}
