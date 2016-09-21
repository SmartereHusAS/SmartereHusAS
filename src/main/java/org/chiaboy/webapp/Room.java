package org.chiaboy.webapp;

/**
 * Created by Evdal on 16.09.2016.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class Room {
    private Sounds sounds;
    private Lights lights;
    private Temperatures temps;
    private String name;
    private String id;

    public Room(String id, String name, Sounds sounds, Lights lights, Temperatures temps){
        this.sounds = sounds;
        this.lights = lights;
        this.temps = temps;
        this.name = name;
        this.id = id;
    }

    public Room() {}

    public String getId(){
        return id;
    }


    @GET
    @Path("rooms/{id}/sounds")
    @Produces(MediaType.APPLICATION_JSON)
    public Sounds getSounds() {
        return sounds;
    }

    @GET
    @Path("rooms/{id}/lights")
    @Produces(MediaType.APPLICATION_JSON)
    public Lights getLights() {
        return lights;
    }

    @GET
    @Path("rooms/{id}/temps")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperatures getTemps() {
        return temps;
    }

}