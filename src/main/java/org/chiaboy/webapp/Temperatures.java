package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.*;

public class Temperatures {
    private static Map<String, Temperature> temps = new HashMap<String, Temperature>() {{
        put("1", new Temperature("1", "generic desc", 11)); //Test-value
        put("2", new Temperature("2", "generic desc", 22)); //Test-value
        put("3", new Temperature("3", "generic desc", 33)); //Test-value
    }};


    //Old
    /*
    @GET
    @Path("/rooms/{roomId}/temps")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Temperature> getTemps(@PathParam("roomId") String roomId) {
        return temps.values();
    }


    @GET
    @Path("/rooms/{roomId}/temps/{tempId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperature getTemp(@PathParam("tempId") String tempId, @PathParam("roomId") String roomId) {
        if(!temps.containsKey(tempId)) {
            throw new NotFoundException();
        }
        return temps.get(tempId);
    }


    @POST
    @Path("/rooms/{roomId}/temps")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTemp(Temperature t) {
        temps.put(t.getId(), t);
    }

    @DELETE
    @Path("/rooms/{roomId}/{tempId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeTemp(@PathParam("tempId") String tempId) {
        temps.remove(tempId);
    }

    */
    /*
    public boolean editTemp(String tempId, Temperature newTemp) {
        return temps.containsKey(tempId) && temps.replace(tempId, temps.get(tempId), newTemp);
    }
    */

}
