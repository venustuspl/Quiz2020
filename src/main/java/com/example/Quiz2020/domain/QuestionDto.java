package com.example.Quiz2020.domain;

import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {

    private long id;
    private String content;
    private List<String> options;
    private String answer;

}
