package com.example.Quiz2020.domain;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {

    private long id;
    private String content;

    @Override
    public String toString() {
        return "QuestionDto{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
