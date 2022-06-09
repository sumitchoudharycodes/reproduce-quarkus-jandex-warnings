package com.sumit;

import com.sumit.models.TestClass2;
import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.reactive.RestResponse;
import org.jooq.Schema;
import org.jooq.impl.SchemaImpl;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<RestResponse<String>> hello() {
        return Uni.createFrom().item(RestResponse.ok("Hello from RESTEasy Reactive"));
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<RestResponse<String>> helloPost(TestClass2 reqest) {
        Schema schema = new SchemaImpl("name");

        return Uni.createFrom().item(RestResponse.ok("Hello from RESTEasy Reactive"));
    }
}