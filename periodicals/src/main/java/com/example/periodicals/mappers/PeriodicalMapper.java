package com.example.periodicals.mappers;

import com.example.periodicals.dto.PeriodicalDto;
import com.example.periodicals.model.Periodical;
import org.mapstruct.Mapper;

@Mapper
public interface PeriodicalMapper {
    PeriodicalDto toPeriodicalDto(Periodical periodical);

    Periodical toPeriodical(PeriodicalDto periodicalDto);
}
