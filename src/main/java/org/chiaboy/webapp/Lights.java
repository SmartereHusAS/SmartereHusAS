package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by KristofferLaptop on 16-Sep-16.
 */
@Path("/rooms/{roomId}")
public class Lights {
    private static Map<String, Light> lights = new HashMap<String, Light>() {{
        put("1", new Light("1", true, "90")); //Test-value
        put("2", new Light("2", true, "50")); //Test-value
        put("3", new Light("3", true, "30")); //Test-value
    }};

    @GET
    @Path("/lights")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Light> getTemps() {
        return lights.values();
    }

    @GET
    @Path("/lights/{lightId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Light getTemp(@PathParam("lightId") String lightId) {
        if(!lights.containsKey(lightId)) {
            throw new NotFoundException();
        }
        return lights.get(lightId);
    }

    @POST
    @Path("/lights")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addLight(Light l) {
        lights.put(l.getId(), l);
    }

    @DELETE
    @Path("/lights/{lightId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeTemp(@PathParam("lightId") String lightId) {
        lights.remove(lightId);
    }

    /*
    public boolean editLigth(String ligthID, Light newLight){
        return lights.containsKey(ligthID) && lights.replace(ligthID, lights.get(ligthID), newLight);
    }
     */

}
