package com.example.periodicals.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Periodical {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int price;

    @ManyToMany(mappedBy = "periodicals")
    private List<Theme> themes = new ArrayList<>();

    @ManyToMany(mappedBy = "periodicals")
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "periodical")
    private List<Source> sources;
    private String description;

}
