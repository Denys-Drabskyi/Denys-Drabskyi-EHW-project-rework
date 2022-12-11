package com.example.periodicals.dto;

import com.example.periodicals.model.Periodical;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class UserDto {
    private long id;
    private String name;

    private String login;

    private int money;

    private List<Periodical> periodicals;

    public void addPeriodical(Periodical periodical) {
        this.periodicals.add(periodical);
    }
}
