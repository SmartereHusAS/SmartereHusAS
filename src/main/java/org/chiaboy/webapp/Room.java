package org.chiaboy.webapp;

/**
 * Created by Evdal on 16.09.2016.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Room {
    private String id;
    private String name;
    private Sounds sounds;
    private Lights lights;
    private Temperatures temps;



    public Room(String id, String name, Sounds sounds, Lights lights, Temperatures temps){
        this.id = id;
        this.name = name;
        this.sounds = sounds;
        this.lights = lights;
        this.temps = temps;
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

}