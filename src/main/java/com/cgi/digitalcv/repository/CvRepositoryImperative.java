package com.cgi.digitalcv.repository;

import com.cgi.digitalcv.domain.Cv;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class CvRepositoryImperative implements PanacheMongoRepository<Cv> {

}
