package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

public class Sounds {
    private Alarms alarms;
    private int volume = 0;

    private static Map<String, SoundDevice> soundDevices = new HashMap<String, SoundDevice>() {{
        put("1", new SoundDevice("1", "generic desc", "10")); //Test-value
        put("2", new SoundDevice("2", "generic desc", "20")); //Test-value
        put("3", new SoundDevice("3", "generic desc", "30")); //Test-value
    }};

    //Old
    /*
    @GET
    @Path("/rooms/{roomId}/sounds")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<SoundDevice> getSoundDevices() {
        System.out.println("tabell: " + soundDevices.toString());

        return soundDevices.values();
    }

    @GET
    @Path("/rooms/{roomId}/sounds/{soundDeviceId}")
    @Produces(MediaType.APPLICATION_JSON)
    public SoundDevice getSoundDevice(@PathParam("soundDeviceId") String soundDeviceId){
        return soundDevices.get(soundDeviceId);
    }


    @POST
    @Path("/rooms/{roomId}/sounds")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addSoundDevice(SoundDevice sd) {
        System.out.println("Added new device!\nid: " + sd.getId() + "\nvolume: " + sd.getVolume());
        soundDevices.put(sd.getId(), sd);
    }

    @DELETE
    @Path("/rooms/{roomId}/sounds/{soundDeviceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeSoundDevice(@PathParam("soundDeviceId") String soundDeviceId) {
        System.out.println("Device deleted!\nid: " + soundDeviceId);
        soundDevices.remove(soundDeviceId);
    }

    @PUT
    @Path("/rooms/{roomId}/sounds/{soundDeviceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void setDeviceVolume(@PathParam("soundDeviceId") String soundDeviceId, String volume){
        soundDevices.get(soundDeviceId).setVolume(volume);
    }

    */

    @GET
    @Path("/rooms/{roomId}/alarms")
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



