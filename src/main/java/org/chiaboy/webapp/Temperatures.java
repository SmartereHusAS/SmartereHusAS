package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.*;

/**
 * Created by asdfLaptop on 16.09.2016.
 */
@Path("/rooms/{roomId}")
public class Temperatures {
    private static Map<String, Temperature> temps = new HashMap<String, Temperature>() {{
        put("1", new Temperature("1", 11.1, 1.11)); //Test-value
        put("2", new Temperature("2", 22.2, 2.22)); //Test-value
        put("3", new Temperature("3", 33.3, 3.33)); //Test-value
    }};

    @GET
    @Path("/temps")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Temperature> getTemps() {
        return temps.values();
    }

    @GET
    @Path("/temps/{tempId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperature getTemp(@PathParam("tempId") String tempId) {
        if(!temps.containsKey(tempId)) {
            throw new NotFoundException();
        }
        return temps.get(tempId);
    }

    @POST
    @Path("/temps")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTemp(Temperature t) {
        temps.put(t.getId(), t);
    }

    @DELETE
    @Path("/{tempId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeTemp(@PathParam("tempId") String tempId) {
        temps.remove(tempId);
    }

    /*
    public boolean editTemp(String tempId, Temperature newTemp) {
        return temps.containsKey(tempId) && temps.replace(tempId, temps.get(tempId), newTemp);
    }
    */

}
