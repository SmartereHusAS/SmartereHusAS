package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Room {
    private String id;
    private String name;
    private static Map<String, SoundDevice> sounds;
    private static Map<String, Light> lights;
    private static Map<String, Temperature> temps;


    public Room(String id, String name){
        this.id = id;
        this.name = name;
        sounds = new HashMap<String, SoundDevice>();
        lights = new HashMap<String, Light>();
        temps = new HashMap<String, Temperature>();
    }

    public Room() {}

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    //
    // Lights
    //

    public Collection<Light> getLights() {
        return lights.values();
    }

    public Light getLight(String id) {
        return lights.get(id);
    }

    public void addLight(Light l) {
        lights.put(l.getId(), l);
    }

    public void removeLight(String id) {
        lights.remove(id);
    }


    //
    // Sounds
    //

    public Collection<SoundDevice> getSounds() {
        return sounds.values();
    }

    public SoundDevice getSoundDevice(String id) {
        return sounds.get(id);
    }

    public void addSoundDevice(SoundDevice sd) {
        sounds.put(sd.getId(), sd);
    }

    public void editSound_test(String id, SoundDevice sd) {
        sounds.replace(id, sd);
    }

    public void editSound(String id, String newVol) {
        sounds.get(id).setVolume(newVol);
    }

    public void removeSoundDevice(String id) {
        sounds.remove(id);
    }


    //
    // Temps
    //

    public Collection<Temperature> getTemps() {
        return temps.values();
    }

    public Temperature getTemp(String id) {
        return temps.get(id);
    }

    public void addTemp(Temperature t) {
        temps.put(t.getId(), t);
    }

    public void removeTemp(String id) {
        temps.remove(id);
    }




    //Old
    /*
    @GET
    @Path("rooms/{roomId}/sounds")
    @Produces(MediaType.APPLICATION_JSON)
    public Sounds getSounds() {
        return sounds;
    }

    @GET
    @Path("rooms/{roomId}/lights")
    @Produces(MediaType.APPLICATION_JSON)
    public Lights getLights() {
        return lights;
    }

    @GET
    @Path("rooms/{roomId}/temps")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperatures getTemps() {
        return temps;
    }
    */

}