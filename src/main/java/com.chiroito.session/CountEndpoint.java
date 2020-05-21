package com.chiroito.session;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/session")
public class CountEndpoint {

    @Inject
    private Counter counter;

    @GET
    @Path("count")
    public String getClichedMessage() {

        counter.countUp();
        return "counter=" + counter.getValue();
    }

    @GET
    @Path("read")
    public String read() {
        return "counter=" + counter.getValue();
    }
}
