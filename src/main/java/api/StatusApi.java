package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/rest/status")
public interface StatusApi {

    @GET
    String getStatus();
}
