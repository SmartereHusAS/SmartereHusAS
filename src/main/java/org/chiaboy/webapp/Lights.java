package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Lights {
    private static Map<String, Light> lights = new HashMap<String, Light>() {{
        put("1", new Light("1", "generic desc", true, 111)); //Test-value
        put("2", new Light("2", "generic desc", true, 222)); //Test-value
        put("3", new Light("3", "generic desc", true, 333)); //Test-value
    }};

    //Old
    /*
    @GET
    @Path("/rooms/{roomId}/lights")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Light> getTemps(@PathParam("roomId") String roomId) {
        return lights.values();
    }


    @GET
    @Path("/rooms/{roomId}/lights/{lightId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Light getTemp(@PathParam("lightId") String lightId) {
        if(!lights.containsKey(lightId)) {
            throw new NotFoundException();
        }
        return lights.get(lightId);
    }


    @POST
    @Path("/rooms/{roomId}/lights")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addLight(Light l) {
        lights.put(l.getId(), l);
    }



    @DELETE
    @Path("/rooms/{roomId}/lights/{lightId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeTemp(@PathParam("lightId") String lightId) {
        lights.remove(lightId);
    }

    */

    /*
    public boolean editLight(String lightID, Light newLight){
        return lights.containsKey(lightID) && lights.replace(lightID, lights.get(lightID), newLight);
    }
     */

}
