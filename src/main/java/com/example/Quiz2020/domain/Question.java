package com.example.Quiz2020.domain;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private int id;
    private String question;
    private List<Answer> answerList = new ArrayList<>();

    public Question(int id, String question, List<Answer> answerList) {
        this.id = id;
        this.question = question;
        this.answerList = answerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
}
