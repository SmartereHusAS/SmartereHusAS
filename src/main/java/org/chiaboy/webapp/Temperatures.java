package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.*;

/**
 * Created by asdfLaptop on 16.09.2016.
 */
@Path("/")
public class Temperatures {
    private static Map<String, Temperature> temps = new HashMap<String, Temperature>() {{
        put("1", new Temperature("1", 20.0, 17.0)); //Test-value
    }};

    @GET
    @Path("rooms/{id}/temps")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Temperature> getTemps() {
        return temps.values();
    }

    @GET
    @Path("rooms/{id}/temps/{tempId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperature getTemp(@PathParam("tempId") String tempId) {
        if(!temps.containsKey(tempId)) {
            throw new NotFoundException();
        }
        return temps.get(tempId);
    }

    @POST
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
