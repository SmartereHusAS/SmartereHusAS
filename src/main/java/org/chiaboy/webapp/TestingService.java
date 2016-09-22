package org.chiaboy.webapp;

/**
 * Created by asdfLaptop on 21.09.2016.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/kunder/")
public class TestingService {
    //Testing
    private static Map<String,TestObj> testObjects = new HashMap<String,TestObj>() {{
        put("1", new TestObj("1", "Julenissen"));
        put("2", new TestObj("2", "Tante rod"));
    }};

    @GET
    @Path("/{kundeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public TestObj getKunde(@PathParam("kundeId") String kundeId) {
        return testObjects.get(kundeId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TestObj> getTestObj() {
        System.out.println("tabell: " + testObjects.toString());
        return testObjects.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addKunde(TestObj testObj) {
        System.out.println("id: " + testObj.getId() + "\nname: " + testObj.getName());
        testObjects.put(testObj.getId(), testObj);
    }

    @DELETE
    @Path("{testId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteKunde(@PathParam("testId") String testId) {
        testObjects.remove(testId);
    }

    /*
    @PUT
    @Path("{kundeId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void editKunde(@PathParam("kundeId") String kundeId, TestObj k) {
        if(!testObjects.containsKey(kundeId)) {
            throw new NotFoundException();
        }
        testObjects.replace(kundeId, k);
    }
    */
}