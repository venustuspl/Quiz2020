package com.example.Quiz2020.domain;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDto {

    private long answerId;
    private long questionId;
    private String answerInfo;
    private Boolean isCorrect;

    @Override
    public String toString() {
        return "AnswerDto{" +
                "answerId=" + answerId +
                ", questionId=" + questionId +
                ", answerInfo='" + answerInfo + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
