package com.example.Quiz2020.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ANSWERS")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name="ANSWER_ID", unique = true)
    private int answerId;

    @NotNull
    @Column(name="QUESTION_ID")
    private int questionId;

    @NotNull
    @Column(name="ANSWER_INFO")
    private String answerInfo;

    @Column(name="IS_CORRECT")
    private Boolean isCorrect;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getAnswerInfo() {
        return answerInfo;
    }

    public void setAnswerInfo(String answerInfo) {
        this.answerInfo = answerInfo;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public Answer(@NotNull int answerId, int questionId, String answerInfo, Boolean isCorrect) {
        this.answerId = answerId;
        this.questionId = questionId;
        this.answerInfo = answerInfo;
        this.isCorrect = isCorrect;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }
}
