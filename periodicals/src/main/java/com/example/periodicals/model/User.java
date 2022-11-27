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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @Column(unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

    private int money;
    private int is_manager;

    // TODO: 20.11.2022 перевірити чи є це правильно
    private final int banned = 0;
    @ManyToMany
    @JoinTable(name = "user_periodicals",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "periodical_id")
    )
    private List<Periodical> periodicals = new ArrayList<>();
}
