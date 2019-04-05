package com.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/random")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class Random {
 
    @GET
    @Path("/status")
    public String getStatus() {
    	return "Random service is running";
    }
}