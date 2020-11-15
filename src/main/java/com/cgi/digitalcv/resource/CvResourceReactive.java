package com.cgi.digitalcv.resource;

import com.cgi.digitalcv.dto.CvDto;
import com.cgi.digitalcv.service.CvServiceReactive;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/reactive/cv/")
public class CvResourceReactive {

    @Inject
    CvServiceReactive cvServiceReactive;

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<CvDto> create(CvDto cvDto){
        return cvServiceReactive.create(cvDto);
    }

}
