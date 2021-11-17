package com.cgi.digitalcv.resource;

import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.cgi.digitalcv.dto.CvDto;
import com.cgi.digitalcv.mapper.CvMapper;
import com.cgi.digitalcv.service.CvServiceImperative;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/imperative/cv")
public class CvResourceImperative {

    @ConfigProperty(name = "greeting.message")
    String message;

    @ConfigProperty(name = "greeting.suffix", defaultValue = "!")
    String suffix;

    @ConfigProperty(name = "greeting.name")
    Optional<String> name;

    @ConfigProperty(name = "greeting.essai", defaultValue = "undef")
    String varia;
    
    @Inject
    CvServiceImperative cvServiceImperative;

    @Inject
    CvMapper cvMapper;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return message + " " + name.orElse("world") + suffix + varia;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CvDto create(CvDto cvDto){

        return cvServiceImperative.create(cvDto);
    }
}
