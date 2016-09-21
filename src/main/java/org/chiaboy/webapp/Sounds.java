package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;


/**
 * Created by Magnusfn on 16.09.2016.
 */
@Path("/sounds")
public class Sounds {
    private Alarms alarms;
    private int volume = 0;
    private static Map<String, SoundDevice> soundDevices = new HashMap<String, SoundDevice>();


    @GET
    @Path("/{soundDeviceId}")
    @Produces(MediaType.APPLICATION_JSON)

    public SoundDevice getSoundDevice(@PathParam("soundDeviceId") String soundDeviceId){
        return soundDevices.get(soundDeviceId);
    }


    @POST
    @Path("/{soundDeviceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void setDeviceVolume(int volume, @PathParam("soundDeviceId") String soundDeviceId){
        soundDevices.get(soundDeviceId).setVolume(volume);
    }

    @GET
    @Path("/alarms")
    @Produces(MediaType.APPLICATION_JSON)
    public Alarms getAlarms(){
        return alarms;
    }

    public void setVolume(int volume){
        if(volume < 0 || volume > 100){
            throw new InputMismatchException();
        }
        else{
            this.volume = volume;
        }
    }

}



