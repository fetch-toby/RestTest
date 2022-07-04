import api.PerfectNumberApiImpl;
import api.StatusApiImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RestMain {
    private static final Logger LOGGER = LogManager.getLogger(RestMain.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Starting RestTest application!");
        String endpoint = "http://0.0.0.0:8080";
        startServer(endpoint);
    }

    public static Server startServer(final String endpoint) {
        final StatusApiImpl status = new StatusApiImpl();
        final PerfectNumberApiImpl perf = new PerfectNumberApiImpl();
        final JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setServiceBean(status);
        sf.setServiceBean(perf);
        sf.setAddress(endpoint);

        return sf.create();
    }
}
