package com.iqmsoft

import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path

@Path("/")
class TestResource {
    @GET
    @Produces("text/plain")
    def String getMessage() {
        return "Hello World From Spring Boot Jersey Groovy!";
    }
}

