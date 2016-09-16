package org.chiaboy.webapp;

/**
 * Created by Evdal on 16.09.2016.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/room")
public class Room{
    private Sounds sounds;
    private Lights lights;
    private Temperatures temps;
    private String name;
    private String id;

    public Room(Sounds sounds, Lights lights, Temperatures temps, String name, String id){
        this.sounds = sounds;
        this.lights = lights;
        this.temps = temps;
        this.name = name;

    }
    public String getId(){
        return id;
    }

    @GET
    @Path("/sounds")
    @Produces(MediaType.APPLICATION_JSON)
    public Sounds getSounds() {
        return sounds;
    }
    @GET
    @Path("/lights")
    @Produces(MediaType.APPLICATION_JSON)
    public Lights getLights() {
        return lights;
    }
    @GET
    @Path("/temps")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperatures getTemps() {
        return temps;
    }

}