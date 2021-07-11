package my.project.org;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

@ApplicationScoped
@Path("/simple")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MySimpleRest {


    Logger logger = Logger.getLogger(getClass());

    @GET
    public Response simple() {
        logger.info("ciao ciao");
        return Response.ok().build();
    }

}
