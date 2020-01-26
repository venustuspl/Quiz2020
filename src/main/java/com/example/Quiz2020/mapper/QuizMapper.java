package com.example.Quiz2020.mapper;

import com.example.Quiz2020.domain.Answer;
import com.example.Quiz2020.domain.Question;
import com.example.Quiz2020.domain.QuizDto;
import com.example.Quiz2020.repository.AnswerRepository;
import com.example.Quiz2020.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuizMapper {

    @Autowired
    QuestionMapper questionMapper;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    AnswerMapper answerMapper;

    public QuizDto mapToQuizDto(){

        return new QuizDto(questionMapper.mapToQuestionDtoList(questionRepository.findAll()),
                answerMapper.mapToAnswerStringList(answerRepository.findAll()),
                answerMapper.selectGoodAnswer(answerRepository.findAll()));


    }
}
