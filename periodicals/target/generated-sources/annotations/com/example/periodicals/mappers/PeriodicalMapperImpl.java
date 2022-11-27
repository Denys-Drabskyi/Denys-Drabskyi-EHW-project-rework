package com.example.periodicals.mappers;

import com.example.periodicals.dto.PeriodicalDto;
import com.example.periodicals.model.Periodical;
import com.example.periodicals.model.Theme;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-27T22:57:47+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
public class PeriodicalMapperImpl implements PeriodicalMapper {

    @Override
    public PeriodicalDto toPeriodicalDto(Periodical periodical) {
        if ( periodical == null ) {
            return null;
        }

        PeriodicalDto.PeriodicalDtoBuilder periodicalDto = PeriodicalDto.builder();

        periodicalDto.id( (int) periodical.getId() );
        periodicalDto.name( periodical.getName() );
        periodicalDto.price( periodical.getPrice() );
        List<Theme> list = periodical.getThemes();
        if ( list != null ) {
            periodicalDto.themes( new ArrayList<Theme>( list ) );
        }
        periodicalDto.description( periodical.getDescription() );

        return periodicalDto.build();
    }

    @Override
    public Periodical toPeriodical(PeriodicalDto periodicalDto) {
        if ( periodicalDto == null ) {
            return null;
        }

        Periodical.PeriodicalBuilder periodical = Periodical.builder();

        periodical.id( periodicalDto.getId() );
        periodical.name( periodicalDto.getName() );
        periodical.price( periodicalDto.getPrice() );
        ArrayList<Theme> arrayList = periodicalDto.getThemes();
        if ( arrayList != null ) {
            periodical.themes( new ArrayList<Theme>( arrayList ) );
        }
        periodical.description( periodicalDto.getDescription() );

        return periodical.build();
    }
}
