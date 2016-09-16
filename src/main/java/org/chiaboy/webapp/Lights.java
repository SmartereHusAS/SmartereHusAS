package org.chiaboy.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
/**
 * Created by KristofferLaptop on 16-Sep-16.
 */
@Path("/lights")
public class Lights {
    private static HashMap<String, Light> lights = new HashMap<String, Light>();

    public void addLight(String ligthId, Light light){
        lights.put(ligthId, light);
    }
    public void addLight(String ligthId, boolean state, int watt){
        Light ligth = new Light(state, watt);
        lights.put(ligthId, ligth);
    }
    public boolean editLigth(String ligthID, Light newLight){
        return lights.containsKey(ligthID) && lights.replace(ligthID, lights.get(ligthID), newLight);
    }

    @GET
    @Path("/{lightId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Light getLigth(@PathParam("lightId") String ligthId){
        return lights.get(ligthId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Light> getLights(){
        return lights.values();
    }
    public void removeLight(String lightId){
        lights.remove(lightId);
    }

}
