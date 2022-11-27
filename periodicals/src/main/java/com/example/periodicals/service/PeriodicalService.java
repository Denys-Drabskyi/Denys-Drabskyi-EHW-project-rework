package com.example.periodicals.service;

import com.example.periodicals.dto.PeriodicalDto;

import java.util.ArrayList;


public interface PeriodicalService {
    ArrayList<PeriodicalDto> getPeriodicals();
    PeriodicalDto getPeriodical();
    PeriodicalDto editPeriodical();
    void deletePeriodical();
}
