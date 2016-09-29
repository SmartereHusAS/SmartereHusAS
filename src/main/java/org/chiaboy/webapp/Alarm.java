package org.chiaboy.webapp;
import org.joda.time.DateTime;

import java.util.Date;
import java.util.InputMismatchException;

public class Alarm {
    private DateTime alarmTime;
    private Room room;
    private int volume = 80;
    private boolean isOn = true;
    public Alarm(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, Room room){
        alarmTime = new DateTime(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0);
        this.room = room;
    }

    public Alarm() {}

    public void setVolume(int volume){
        if(volume > 100 || volume < 0){
            throw new InputMismatchException("Volume must be between 0 and 100");
        }
        this.volume = volume;
    }
    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }

    public boolean isOn(){
        return isOn;
    }

    public DateTime getAlarmTime(){
        return alarmTime;
    }


    public Room getRoom(){
        return room;
    }

    public void addAlarmTime(int minutes){
        alarmTime.plusMinutes(minutes);
    }
/*
    public void goOff(){
        room.getSounds().setVolume(80);
    }
    public void shutDown(){
        room.getSounds().setVolume(0);
    }

*/
}
