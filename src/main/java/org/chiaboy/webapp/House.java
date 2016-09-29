package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Path("/rooms")
public class House{
    private static Map<String, Room> rooms = new HashMap<String, Room>() {{
        put("1", new Room("1", "Living room")); //Test-value
        put("2", new Room("2", "Dining room")); //Test-value
        put("3", new Room("3", "Bathroom")); //Test-value

    }};


    //
    // Rooms
    //

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Room> getRooms(){
        return rooms.values();
    }

    @GET
    @Path("/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Room getRoom(@PathParam("roomId") String roomId){
        if(!rooms.containsKey(roomId)) {
            throw new NotFoundException();
        }
        return rooms.get(roomId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addRoom(Room r){
        rooms.put(r.getId(), r);
    }


    //
    // Lights
    //

    @GET
    @Path("/{roomId}/lights")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Light> getLights(@PathParam("roomId") String roomId) {
        return rooms.get(roomId).getLights();
    }

    @GET
    @Path("/{roomId}/lights/{lightId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Light getLight(@PathParam("roomId") String roomId, @PathParam("lightId") String lightId) {
        return rooms.get(roomId).getLight(lightId);
    }

    @POST
    @Path("/{roomId}/lights")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addLight(Light l, @PathParam("roomId") String roomId) {
        rooms.get(roomId).addLight(l);
    }

    @DELETE
    @Path("/{roomId}/lights/{lightId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeLight(@PathParam("roomId") String roomId, @PathParam("lightId") String lightId) {
        rooms.get(roomId).removeLight(lightId);
    }


    //
    // Sounds
    //

    @GET
    @Path("/{roomId}/sounds")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<SoundDevice> getSounds(@PathParam("roomId") String roomId) {
        if(!rooms.containsKey(roomId)) {
            throw new NotFoundException();
        }
        return rooms.get(roomId).getSounds();
    }

    @GET
    @Path("/{roomId}/sounds/{soundId}")
    @Produces(MediaType.APPLICATION_JSON)
    public SoundDevice getSoundDevice(@PathParam("roomId") String roomId, @PathParam("soundId") String soundId) {
        if(!rooms.containsKey(roomId) /*!rooms.get(roomId).getSounds().contains(soundId)*/) {
            throw new NotFoundException();
        }
        return rooms.get(roomId).getSoundDevice(soundId);
    }

    @POST
    @Path("/{roomId}/sounds")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addSoundDevice(SoundDevice sd, @PathParam("roomId") String roomId) {
        rooms.get(roomId).addSoundDevice(sd);
    }

    //Testing
    @PUT
    @Path("/{roomId}/sounds/{soundId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void editSound_test(SoundDevice sd, @PathParam("roomId") String roomId, @PathParam("soundId") String soundId){
        rooms.get(roomId).editSound_test(soundId, sd);
    }

    /*
    @PUT
    @Path("/{roomId}/sounds/{soundId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void editSound(@PathParam("roomId") String roomId, @PathParam("soundId") String soundId, String volume){
        rooms.get(roomId).editSound(soundId, volume);
    }
    */

    @DELETE
    @Path("/{roomId}/sounds/{soundId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeSoundDevice(@PathParam("roomId") String roomId, @PathParam("soundId") String soundId) {
        rooms.get(roomId).removeSoundDevice(soundId);
    }


    //
    // Temps
    //

    @GET
    @Path("/{roomId}/temps")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Temperature> getTemps(@PathParam("roomId") String roomId) {
        return rooms.get(roomId).getTemps();
    }

    @GET
    @Path("/{roomId}/temps/{tempId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperature getTemp(@PathParam("roomId") String roomId, @PathParam("tempId") String tempId) {
        return rooms.get(roomId).getTemp(tempId);
    }

    @POST
    @Path("/{roomId}/temps")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTemp(Temperature t, @PathParam("roomId") String roomId) {
        rooms.get(roomId).addTemp(t);
    }

    @DELETE
    @Path("/{roomId}/temps/{tempId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeTemp(@PathParam("roomId") String roomId, @PathParam("tempId") String tempId) {
        rooms.get(roomId).removeTemp(tempId);
    }
}
