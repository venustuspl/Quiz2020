package com.example.Quiz2020.controller;

import com.example.Quiz2020.domain.AnswerDto;
import com.example.Quiz2020.domain.QuestionDto;
import com.example.Quiz2020.domain.QuizDto;
import com.example.Quiz2020.mapper.QuestionMapper;
import com.example.Quiz2020.mapper.QuizMapper;
import com.example.Quiz2020.service.DbService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
public class QuizController {

    @Autowired
    QuizMapper quizMapper;


    @RequestMapping(method = RequestMethod.GET, value = "/quiz")
    public QuizDto getQuiz() {
        return quizMapper.mapToQuizDto();
    }
}
