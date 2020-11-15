package com.cgi.digitalcv.mapper;

import org.bson.types.ObjectId;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ObjectIdMapper {

    ObjectId map(String value);

    String map(ObjectId objectId);

}
