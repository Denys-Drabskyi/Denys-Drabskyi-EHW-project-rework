package com.example.periodicals.controller;

import com.example.periodicals.dto.SourceDto;
import com.example.periodicals.service.SourceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/periodical/{id}/sources")
@AllArgsConstructor
public class SourceController {
    private SourceService sourceService;

    @GetMapping
    public List<SourceDto> getPeriodicalSources(@PathVariable(value = "id") long periodicalId){
        return sourceService.getPeriodicalSources(periodicalId);
    }


}
