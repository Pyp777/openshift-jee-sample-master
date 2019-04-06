package com.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/message")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class MessageController {
 
    @GET
    @Path("/status")
    public String getStatus() {
    	return "Random service is running";
    }

    @POST
    @Path("/clear")
    public String clearStatus() {
    	return "";
    }
    
    /**
     * call jms!
     * @return
     */
    @POST
    @Path("/send")
    public String sendMessage(String message) {
    	return message + " is accepted...";
    }
    
    /**
     * read jms!
     * @return
     */
    public String getMessage() {
    	return "";
    }
    
}