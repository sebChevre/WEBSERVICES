package rest.webservices.standalone;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;


import com.sun.deploy.util.SessionState;
import org.glassfish.jersey.client.ClientConfig;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;


/**
 * Created by sce on 12.11.2014.
 */
public class RestClient {
    public static void main(String[] args) {

        ClientConfig config = new ClientConfig();

        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target(getBaseURI());

        System.out.println(target.path("test").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString());

        System.out.println(target.path("test").request().accept(MediaType.TEXT_PLAIN).get(String.class));

        System.out.println(target.path("test").request().accept(MediaType.TEXT_XML).get(String.class));

        System.out.println(target.path("test").request().accept(MediaType.TEXT_HTML).get(String.class));

    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:9998").build();
    }


}
