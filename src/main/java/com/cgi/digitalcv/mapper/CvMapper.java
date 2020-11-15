package com.cgi.digitalcv.mapper;

import com.cgi.digitalcv.domain.Cv;
import com.cgi.digitalcv.dto.CvDto;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ap.internal.util.Strings;

@Mapper(componentModel = "cdi", uses = ObjectIdMapper.class)
public interface CvMapper {

    @Mapping(source = "id", target = "id", qualifiedByName = "stringToObjectId")
    Cv toDomain(CvDto cvDto);

    @Mapping(source = "id", target = "id", qualifiedByName = "objectIdToString")
    CvDto toDto(Cv cv);

    @Named("stringToObjectId")
    default ObjectId stringToObjectId(String value){
        if(Strings.isEmpty(value)){
            return null;
        }
        return new ObjectId(value);
    }

    @Named("objectIdToString")
    default String objectIdToString(ObjectId value){
        if(value == null){
            return null;
        }
        return value.toString();
    }

}
