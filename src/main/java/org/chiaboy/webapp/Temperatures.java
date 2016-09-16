package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.*;

/**
 * Created by asdfLaptop on 16.09.2016.
 */
@Path("/temperatures/")
public class Temperatures {
    private HashMap<String, Temperature> temps = new HashMap<String, Temperature>() {{
        put("1", new Temperature(20.0, 17.0)); //Test-value
    }};

    //Maybe
    private final int FLOOR = 0;
    private final int AMBIENT = 1;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTemp(String tempId, Temperature t) {
        temps.put(tempId, t);
    }

    /*
    public void addTemp(String tempId, double floor, double ambient) {
        temps.put(tempId, new Temperature(floor, ambient));
    }
    */

    public boolean editTemp(String tempId, Temperature newTemp) {
        return temps.containsKey(tempId) && temps.replace(tempId, temps.get(tempId), newTemp);
    }

    @GET
    @Path("/{tempId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperature getTemp(@PathParam("tempId") String tempId) {
        return temps.get(tempId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Temperature> getTemps() {
        return temps.values();
    }

    public void removeTemp(String tempId) {
        temps.remove(tempId);
    }

}
