package com.example.Quiz2020.mapper;

import com.example.Quiz2020.domain.Answer;
import com.example.Quiz2020.domain.AnswerDto;
import com.example.Quiz2020.domain.Question;
import com.example.Quiz2020.domain.QuestionDto;
import com.example.Quiz2020.repository.AnswerRepository;
import com.example.Quiz2020.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AnswerMapper {

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    DbService dbSerwis;

    public Answer mapToAnswer(final AnswerDto answerDto) {
        return new Answer(
                answerDto.getAnswerId(),
                answerDto.getQuestionId(),
                answerDto.getAnswerInfo(),
                answerDto.getIsCorrect());
    }


    public AnswerDto mapToAnswerDto(final Answer answer) {
        return new AnswerDto(
                answer.getAnswerId(),
                answer.getQuestionId(),
                answer.getAnswerInfo(),
                answer.getCorrect()
        );
    }

    public List<AnswerDto> mapToAnswerDtoList(final List<Answer> answerList) {
        return answerList.stream()
                .map(q -> new AnswerDto(q.getAnswerId(), q.getQuestionId(), q.getAnswerInfo(), q.getCorrect()))
                .collect(Collectors.toList());
    }

    public List<String> mapToAnswerStringList(final List<Answer> answersList) {
        return answersList.stream()
                .map(a -> a.getAnswerInfo())
                .collect(Collectors.toList());
    }

    public String selectGoodAnswer(int id) {
        return dbSerwis.getAllQuestionAnswers(id).stream()
                .filter(a -> a.getCorrect() == true)
                .map(a -> a.getAnswerInfo())
                .toString();
    }

    public List<String> mapToAnswerStringListByQuestionId(int id) {
        return dbSerwis.getAllQuestionAnswers(id).stream()
                .map(a -> a.getAnswerInfo())
                .collect(Collectors.toList());
    }
}

