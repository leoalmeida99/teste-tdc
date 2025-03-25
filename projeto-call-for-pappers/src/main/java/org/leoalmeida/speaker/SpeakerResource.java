package org.leoalmeida.speaker;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("speaker")
public class SpeakerResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Speaker> speakers() {
        return Speaker.listAll();
    }

    @Path("findById")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Speaker findById(@QueryParam("id") Long id){
        return Speaker.findById(id);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Speaker newSpeaker(Speaker speaker) {
        speaker.id = null;
        speaker.persist();

        return speaker;
    }
}