package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;


/**
 * Created by Magnusfn on 16.09.2016.
 */
@Path("/room")
public class Sounds {
    private Alarms alarms;
    private int volume = 0;
    private static HashMap<String, SoundDevice> soundDevices = new HashMap<String, SoundDevice>();


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
    @Path("/alarms")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Alarms getAlarms(){
        return alarms;
    }

}


