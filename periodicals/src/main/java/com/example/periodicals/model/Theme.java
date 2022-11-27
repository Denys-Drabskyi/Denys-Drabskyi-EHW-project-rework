package com.example.periodicals.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "periodical_theme",
            joinColumns = @JoinColumn(name = "periodical_id"),
            inverseJoinColumns = @JoinColumn(name = "theme_id"))
    private List<Periodical> periodicals = new ArrayList<>();

    public List<Periodical> getPeriodicals() {
        return periodicals;
    }

    public void setPeriodicals(List<Periodical> periodicals) {
        this.periodicals = periodicals;
    }

//    @ManyToMany(mappedBy = "themes")
//    private List<Periodical> periodicals = new ArrayList<>();

}
