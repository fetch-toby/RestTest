import api.RestApiImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import java.net.URISyntaxException;

public class RestMain {
    public static void main(String[] args) throws URISyntaxException {
        String endpoint = "http://0.0.0.0:8080";
        startServer(endpoint);
    }

    public static Server startServer(final String endpoint) {
        final RestApiImpl rest = new RestApiImpl();
        final JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setServiceBean(rest);
        sf.setAddress(endpoint);

        return sf.create();
    }
}
