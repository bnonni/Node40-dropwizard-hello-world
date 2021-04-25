package com.example.helloworld.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;

    public HelloWorldResource(String template) {
        this.template = template;
    }

    @GET
    @Timed
    public String sayHello() {
        final String value = String.format(template);
        return value;
    }
}
