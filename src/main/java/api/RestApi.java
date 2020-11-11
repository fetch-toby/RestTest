package api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public interface RestApi {
    @GET
    @Path("/status")
    @Produces({ MediaType.TEXT_HTML, MediaType.TEXT_PLAIN })
    Response isAlive();

}
