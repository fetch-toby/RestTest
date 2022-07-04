package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/rest")
public interface PerfectNumber {

    @GET
    @Path("/perfectnumber/{number}")
    String checkPerfectNumber(@PathParam("number") final Integer number);

    @GET
    @Path("/perfectnumber")
    String getPerfectNumberForRange(@QueryParam(value = "min") Integer min, @QueryParam(value = "max") Integer max);

}
