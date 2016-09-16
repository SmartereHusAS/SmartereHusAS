package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Evdal on 16.09.2016.
 */
@Path("/room")
public class House{
    private static HashMap<String,Room> rooms = new HashMap<String,Room>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Room> getRooms(){
        return rooms.values();
    }
    @GET
    @Path("/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Room getRoom(@PathParam("roomId") String roomId){
        return rooms.get(roomId);
    }
    @POST
    @Path("/{roomId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addRoom(Room room){
        rooms.put(room.getId(),room);
    }

}
