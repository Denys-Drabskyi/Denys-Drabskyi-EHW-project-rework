package com.example.periodicals.service.impl;

import com.example.periodicals.dto.PeriodicalDto;
import com.example.periodicals.mappers.PeriodicalMapper;
import com.example.periodicals.repository.PeriodicalRepository;
import com.example.periodicals.service.PeriodicalService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class PeriodicalServiceImpl implements PeriodicalService {
    private PeriodicalRepository periodicalRepository;
    private PeriodicalMapper periodicalMapper;

    @Override
    public PeriodicalDto getPeriodicalById(long id) {
        return periodicalMapper.toPeriodicalDto(
                periodicalRepository.getPeriodicalById(id)
        );
    }

    @Override
    public PeriodicalDto createPeriodical(PeriodicalDto periodicalDto) {
        periodicalRepository.save(
                periodicalMapper.toPeriodical(periodicalDto));
        return periodicalDto;
    }

    @Override
    public PeriodicalDto editPeriodical(long id, PeriodicalDto periodicalDto) {
        periodicalDto.setId(id);
        periodicalRepository.save(periodicalMapper.toPeriodical(periodicalDto));
        return periodicalDto;
    }
}
