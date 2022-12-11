package com.example.periodicals.mappers;

import com.example.periodicals.dto.SourceDto;
import com.example.periodicals.model.Source;
import org.mapstruct.Mapper;

@Mapper
public interface SourceMapper {
    SourceDto toSourceDto (Source source);
    Source toSource (SourceDto sourceDto);
}
