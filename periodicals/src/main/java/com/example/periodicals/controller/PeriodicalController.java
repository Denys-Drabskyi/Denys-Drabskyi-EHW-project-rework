package com.example.periodicals.controller;
import com.example.periodicals.dto.PeriodicalDto;
import com.example.periodicals.service.PeriodicalService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/periodical")
@AllArgsConstructor
public class PeriodicalController {
    private PeriodicalService periodicalService;
    @PostMapping
    public PeriodicalDto createPeriodical (@RequestBody PeriodicalDto periodicalDto){
        return periodicalService.createPeriodical(periodicalDto);
    }
    @GetMapping("/{id}")
    public PeriodicalDto getPeriodicalById (@PathVariable(value = "id") long id){
        return periodicalService.getPeriodicalById(id);
    }

    @PatchMapping("/{id}")
    public PeriodicalDto editPeriodical (@PathVariable(value = "id") long id, @RequestBody PeriodicalDto periodicalDto){
        return periodicalService.editPeriodical(id,periodicalDto);
    }



}
