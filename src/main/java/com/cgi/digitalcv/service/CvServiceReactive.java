package com.cgi.digitalcv.service;

import com.cgi.digitalcv.dto.CvDto;
import com.cgi.digitalcv.mapper.CvMapper;
import com.cgi.digitalcv.repository.CvRepositoryReactive;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CvServiceReactive {

    @Inject
    CvRepositoryReactive cvRepositoryReactive;

    @Inject
    CvMapper cvMapper;

    public Uni<CvDto> create(CvDto cvDto){

        return Uni
                .createFrom()
                .item(() -> cvMapper.toDomain(cvDto) )
                .onItem()
                .transformToUni(cv ->
                    cvRepositoryReactive
                            .persist(cv)
                            .map(unused -> cv)
                )
                .onItem()
                .transform(cv -> cvMapper.toDto(cv));
    }

}
