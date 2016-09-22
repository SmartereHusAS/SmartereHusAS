package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;


/**
 * Created by Magnusfn on 16.09.2016.
 */
@Path("/rooms/{roomId}")
public class Sounds {
    private Alarms alarms;
    private int volume = 0;

    private static Map<String, SoundDevice> soundDevices = new HashMap<String, SoundDevice>() {{
        put("1", new SoundDevice("1", "90")); //Test-value
        put("2", new SoundDevice("2", "20")); //Test-value
        put("3", new SoundDevice("3", "30")); //Test-value
    }};

    @GET
    @Path("/sounds")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<SoundDevice> getSoundDevices() {
        System.out.println("tabell: " + soundDevices.toString());

        return soundDevices.values();
    }
    @GET
    @Path("/sounds/all")
    @Produces("text/plain")
    public Integer getTotalSound() {
        Integer volume = 0;
        for(SoundDevice device : soundDevices.values()){
            volume += Integer.valueOf(device.getVolume());
        }
        volume = volume / soundDevices.size();
        return volume;
    }
    @GET
    @Path("/sounds/{soundDeviceId}")
    @Produces(MediaType.APPLICATION_JSON)
    public SoundDevice getSoundDevice(@PathParam("soundDeviceId") String soundDeviceId){
        return soundDevices.get(soundDeviceId);
    }

    @POST
    @Path("/sounds")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addSoundDevice(SoundDevice sd) {
        System.out.println("Added new device!\nid: " + sd.getId() + "\nvolume: " + sd.getVolume());
        soundDevices.put(sd.getId(), sd);
    }

    @DELETE
    @Path("/sounds/{soundDeviceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeSoundDevice(@PathParam("soundDeviceId") String soundDeviceId) {
        System.out.println("Device deleted!\nid: " + soundDeviceId);
        soundDevices.remove(soundDeviceId);
    }

    @PUT
    @Path("/sounds/{soundDeviceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void setDeviceVolume(@PathParam("soundDeviceId") String soundDeviceId, String volume){
        soundDevices.get(soundDeviceId).setVolume(volume);
    }

    @GET
    @Path("/alarms")
    @Produces(MediaType.APPLICATION_JSON)
    public Alarms getAlarms(){
        return alarms;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addSound(String soundDeviceId, SoundDevice sd){
        soundDevices.put(soundDeviceId, sd);
    }
    public boolean editVolume(String soundDeviceId, SoundDevice newVolume){
        return soundDevices.containsKey(soundDeviceId) && soundDevices.replace(soundDeviceId, soundDevices.get(soundDeviceId), newVolume);
    }

}



