package com.github.cthiebault;

import org.springframework.stereotype.Component;

@Component
//@Path("/")
public class RestResource {

  //  @GET
//  @Produces(MediaType.APPLICATION_JSON)
//  @Path("/hello")
  public String hello() {
    return "Hello World";
  }
}
