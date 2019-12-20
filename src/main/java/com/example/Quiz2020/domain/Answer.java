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
    private long answerId;

    @NotNull
    @Column(name="QUESTION_ID")
    private long questionId;

    @NotNull
    @Column(name="ANSWER_INFO")
    private String answerInfo;

    @Column(name="IS_CORRECT")
    private Boolean isCorrect;

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
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

    public Answer(@NotNull long answerId, long questionId, String answerInfo, Boolean isCorrect) {
        this.answerId = answerId;
        this.questionId = questionId;
        this.answerInfo = answerInfo;
        this.isCorrect = isCorrect;
    }

    public Answer(long questionId, String answerInfo, Boolean isCorrect) {

        this.questionId = questionId;
        this.answerInfo = answerInfo;
        this.isCorrect = isCorrect;
    }

    public Answer() {
    }

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }
}
