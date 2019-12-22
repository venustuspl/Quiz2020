package com.example.Quiz2020.service;

import com.example.Quiz2020.domain.Question;
import com.example.Quiz2020.repository.*;
import com.example.Quiz2020.domain.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    private AnswerRepository repository;

    @Autowired
    private QuestionRepository questionRepository;

    public List<Answer> getAllAnswers() {

        return repository.findAll();
    }

    public List<Answer> getAllQuestionAnswers(int id){
        return repository.retriveAllQuestionAnswers(id);
    }

    public Optional<Answer> getAnswer(Long id) {

        return repository.findById(id);
    }

    public Answer saveAnswer(final Answer answer) {
        return repository.save(answer);
    }

    public void deleteAnswer(Long id) {
        repository.deleteById(id);
    }


    public List<Question> getAllQuestions() {

        return questionRepository.findAll();
    }

    public Optional<Question> getQuestion(Long id) {

        return questionRepository.findById(id);
    }

    public Question saveQuestion(final Question question) {
        return questionRepository.save(question);
    }

    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }

}
