package com.cgi.digitalcv.repository;

import com.cgi.digitalcv.domain.Cv;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;


import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class CvRepositoryReactive implements ReactivePanacheMongoRepository<Cv> {
}
