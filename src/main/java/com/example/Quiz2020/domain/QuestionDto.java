package com.example.Quiz2020.domain;

import lombok.*;

import java.util.List;


@Getter
@Setter

@NoArgsConstructor
public class QuestionDto {
    private final String name = "About evrything";
    private long id;
    private String content;
    private List<String> options;
    private List<String> answer;

    public QuestionDto(long id, String content, List<String> options, List<String> answer) {
        this.id = id;
        this.content = content;
        this.options = options;
        this.answer = answer;
    }
}
