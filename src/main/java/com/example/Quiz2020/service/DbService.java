package com.example.Quiz2020.service;

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


    public List<Answer> getAllAnswers() {

        return repository.findAll();
    }

    //pobieranie zadania przy użyciu id

    public Optional<Answer> getAnswer(Long id) {

        return repository.findById(id);
    }

    public Answer saveAnswer(final Answer answer) {
        return repository.save(answer);
    }

    public void deleteAnswer(Long id){
        repository.deleteById(id);
    }

}
