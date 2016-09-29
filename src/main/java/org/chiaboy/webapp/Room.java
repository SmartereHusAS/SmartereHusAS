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
    private int totalLights;
    private int totalSounds;
    private int totalTemps;

    private static Map<String, SoundDevice> sounds;
    private static Map<String, Light> lights;
    private static Map<String, Temperature> temps;


    public Room(String id, String name){
        this.id = id;
        this.name = name;
        sounds = new HashMap<String, SoundDevice>() {{
            put("1", new SoundDevice("1", "generic desc", "10")); //Test-value
            put("2", new SoundDevice("2", "generic desc", "20")); //Test-value
            put("3", new SoundDevice("3", "generic desc", "30")); //Test-value
        }};
        lights = new HashMap<String, Light>() {{
            put("1", new Light("1", "generic desc", true, 11)); //Test-value
            put("2", new Light("2", "generic desc", true, 22)); //Test-value
            put("3", new Light("3", "generic desc", true, 63)); //Test-value
        }};
        temps = new HashMap<String, Temperature>() {{
            put("1", new Temperature("1", "generic desc", 11)); //Test-value
            put("2", new Temperature("2", "generic desc", 22)); //Test-value
            put("3", new Temperature("3", "generic desc", 33)); //Test-value
        }};
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
    public void setLights(Collection<Light> s) {
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

    public int getTotalLights(){
        int out = 0;
        for(Light light : this.lights.values()){
            out += light.getWattage();
        }
        return out/(lights.size());
    }
    public void setTotalLights(int total){

    }


    //
    // Sounds
    //

    public Collection<SoundDevice> getSounds() {
        return sounds.values();
    }
    public void setSounds(Collection<SoundDevice> s) {
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


    public int getTotalSounds(){
        int out = 0;
        for(SoundDevice sound : sounds.values()){
            out += Integer.valueOf(sound.getVolume());
        }
        System.out.print(sounds.size());
        return out/sounds.size();
    }
    public void setTotalSounds(int total){

    }

    //
    // Temps
    //

    public Collection<Temperature> getTemps() {
        return temps.values();
    }
    public void setTemps(Collection<Temperature> s) {
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

    public int getTotalTemps(){
        int out = 0;
        for(Temperature temp : this.temps.values()){
            out += temp.getTemp();
        }
        return out/temps.size();
    }
    public void setTotalTemps(int total){

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