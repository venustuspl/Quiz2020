package com.example.Quiz2020.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RANKING")
public class Ranking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "RANKING_ID", unique = true)
    private long rankingId;

    @Column(name = "LOGIN")
    String login;

    @Column(name = "POINTS")
    int points;

    @Column(name = "DATE")
    LocalDateTime testDate;

}
