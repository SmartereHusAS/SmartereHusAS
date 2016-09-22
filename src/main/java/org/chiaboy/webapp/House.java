package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evdal on 16.09.2016.
 */
@Path("/")
public class House{
    private static Map<String, Room> rooms = new HashMap<String, Room>() {{
        put("1", new Room("1", "Living room", new Sounds(), new Lights(), new Temperatures())); //Test-value
        put("2", new Room("2", "Dining room", new Sounds(), new Lights(), new Temperatures())); //Test-value

    }};

    @GET
    @Path("/rooms")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Room> getRooms(){
        return rooms.values();
    }


    @GET
    @Path("/rooms/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Room getRoom(@PathParam("roomId") String roomId){
        if(!rooms.containsKey(roomId)) {
            throw new NotFoundException();
        }
        return rooms.get(roomId);
    }

    @POST
    @Path("/rooms")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addRoom(Room r){
        rooms.put(r.getId(), r);
    }
}
