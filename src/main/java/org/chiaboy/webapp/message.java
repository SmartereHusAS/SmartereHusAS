package org.chiaboy.webapp; /**
 * Created by Evdal on 15.09.2016.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/message")
public class message {
    private static String message = "default";
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return message;
    }
    @POST
    //@Consumes(MediaType.TEXT_PLAIN)
    public void setMessage(String nymessage){
        message = nymessage;
    }
}

