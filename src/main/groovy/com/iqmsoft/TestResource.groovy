package com.iqmsoft

import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path

@Path("/")
class TestResource {
    @GET
    @Produces("text/plain")
    def String getMessage() {
        return "Hello From Spring Boot 2.5.4 Jersey Groovy!";
    }
}

