package com.example.Quiz2020.mapper;

import com.example.Quiz2020.domain.Answer;
import com.example.Quiz2020.domain.AnswerDto;
import com.example.Quiz2020.domain.Question;
import com.example.Quiz2020.domain.QuestionDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AnswerMapper {

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
                .map(a ->  a.getAnswerInfo())
                .collect(Collectors.toList());
    }

    public String selectGoodAnswer(final List<Answer> answersList) {
        return answersList.stream()
                .filter(a -> a.getCorrect() == true)
                .map(a ->  a.getAnswerInfo())
                .toString();
    }
}

