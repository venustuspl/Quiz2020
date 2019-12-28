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
public class RankingDto {

    private long rankingId;
    String login;
    int points;
    LocalDateTime testDate;


}
