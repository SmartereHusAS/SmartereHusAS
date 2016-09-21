package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by KristofferLaptop on 16-Sep-16.
 */
@Path("/lights")
public class Lights {
    private static Map<String, Light> lights = new HashMap<String, Light>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Light> getTemps() {
        return lights.values();
    }

    @GET
    @Path("/{lightId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Light getTemp(@PathParam("lightId") String lightId) {
        if(!lights.containsKey(lightId)) {
            throw new NotFoundException();
        }
        return lights.get(lightId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addLight(Light l) {
        lights.put(l.getId(), l);
    }

    @DELETE
    @Path("/{lightId}")
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
