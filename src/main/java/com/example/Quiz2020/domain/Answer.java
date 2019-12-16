package com.example.Quiz2020.domain;

public class Answer {
    private int questionId;
    private String answerInfo;
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

    public Answer(int questionId, String answerInfo, Boolean isCorrect) {
        this.questionId = questionId;
        this.answerInfo = answerInfo;
        this.isCorrect = isCorrect;
    }
}
