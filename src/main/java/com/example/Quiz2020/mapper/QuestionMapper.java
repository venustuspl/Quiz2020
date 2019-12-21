package com.example.Quiz2020.mapper;

import com.example.Quiz2020.domain.Question;
import com.example.Quiz2020.domain.QuestionDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {


        public Question mapToQuestion(final QuestionDto questionDto){
            return new Question(
            questionDto.getId(),
            questionDto.getQuestion());

        }


        public QuestionDto mapToQuestionDto(final Question question){
            return new QuestionDto(
                    question.getId(),
                    question.getQuestion()
                    );

        }

        public List<QuestionDto> mapToTaskDtoList(final List<Question> questionList){
            return questionList.stream()
                    .map(q -> new QuestionDto(q.getId(), q.getQuestion() ))
                    .collect(Collectors.toList());
        }
    }

