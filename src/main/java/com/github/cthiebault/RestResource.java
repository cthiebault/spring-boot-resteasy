package com.github.cthiebault;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/")
public class RestResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/hello")
  public String hello() {
    return "Hello World";
  }
}
