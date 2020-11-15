package com.cgi.digitalcv.service;

import com.cgi.digitalcv.domain.Cv;
import com.cgi.digitalcv.dto.CvDto;
import com.cgi.digitalcv.mapper.CvMapper;
import com.cgi.digitalcv.repository.CvRepositoryImperative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Random;

@ApplicationScoped
public class CvServiceImperative {

    @Inject
    CvRepositoryImperative cvRepositoryImperative;

    @Inject
    CvMapper cvMapper;

    public CvDto create(CvDto cvDto){
        Random r = new Random();
        Cv cv = cvMapper.toDomain(cvDto);
        cvRepositoryImperative.persist(cv);
        return cvMapper.toDto(cv);
    }

}
