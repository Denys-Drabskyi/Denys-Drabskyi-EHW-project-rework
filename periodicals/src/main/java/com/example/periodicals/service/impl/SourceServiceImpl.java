package com.example.periodicals.service.impl;

import com.example.periodicals.dto.SourceDto;
import com.example.periodicals.repository.SourceRepository;
import com.example.periodicals.service.SourceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceServiceImpl implements SourceService {
    private SourceRepository sourceRepository;

    @Override
    public List<SourceDto> getPeriodicalSources(long id) {
        return sourceRepository.getSourcesByPeriodicalId(id);
    }
}
