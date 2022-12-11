package com.example.periodicals.service;


import com.example.periodicals.dto.SourceDto;

import java.util.List;

public interface SourceService {
    List<SourceDto> getPeriodicalSources(long id);
}
