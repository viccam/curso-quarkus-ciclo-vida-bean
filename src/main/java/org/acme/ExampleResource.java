package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    BeanHello bean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        String test = bean.hello();

        return "Hello from RESTEasy Reactive" + " " + test;
    }
}