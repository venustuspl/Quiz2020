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
    //private final String name = "About everything";
    private List<QuestionDto> questions;
    private List<String> options;
    private String answer;

    public QuizDto(List<QuestionDto> questions, List<String> options, String answer) {
        this.questions = questions;
        this.options = options;
        this.answer = answer;
    }


}
