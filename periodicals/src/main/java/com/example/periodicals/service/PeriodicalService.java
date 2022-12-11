package com.example.periodicals.service;

import com.example.periodicals.dto.PeriodicalDto;

import java.util.ArrayList;


public interface PeriodicalService {

    PeriodicalDto getPeriodicalById(long id);

    PeriodicalDto createPeriodical(PeriodicalDto periodicalDto);

    PeriodicalDto editPeriodical(long id, PeriodicalDto periodicalDto);
}
