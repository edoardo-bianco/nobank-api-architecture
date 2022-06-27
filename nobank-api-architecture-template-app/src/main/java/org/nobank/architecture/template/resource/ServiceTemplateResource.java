package org.nobank.architecture.template.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.nobank.architecture.chassis.utility.EchoUtil;

@Path("/service-template")
@ApplicationScoped
public class ServiceTemplateResource {

    @Inject
    EchoUtil echo;
   
    @GET
    @Path("/{message}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("message") String welcomeMessage) {
        return  echo.echo("Quarkus Extension Bean " + welcomeMessage);
    }
}