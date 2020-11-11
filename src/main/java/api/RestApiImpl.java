package api;

import javax.ws.rs.core.Response;

public class RestApiImpl implements RestApi{
    @Override
    public Response isAlive() {
        final String status = "UP";
        return Response.ok(status).build();
    }
}
