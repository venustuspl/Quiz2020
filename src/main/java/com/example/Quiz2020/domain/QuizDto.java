package com.example.Quiz2020.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class QuizDto {
    private final String name = "About everything";
    private List<QuestionDto> questions;

    public QuizDto(List<QuestionDto> questions) {
        this.questions = questions;
    }

}
