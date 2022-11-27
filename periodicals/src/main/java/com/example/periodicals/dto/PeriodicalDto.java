package com.example.periodicals.dto;

import com.example.periodicals.model.Theme;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
public class PeriodicalDto {
    private int id;
    private String name;
    private int price;
    private ArrayList<Theme> themes;
    private String description;

    public void addTheme(Theme theme){
        themes.add(theme);
    }
}
